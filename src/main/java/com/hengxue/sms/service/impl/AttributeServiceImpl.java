package com.hengxue.sms.service.impl;

import com.hengxue.sms.domain.Attribute;
import com.hengxue.sms.exceptions.AttributeException;
import com.hengxue.sms.repository.AttributeRepository;
import com.hengxue.sms.service.AttributeService;
import com.hengxue.sms.util.PageCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Unruly Wind on 2019/4/15/015.
 *
 * @author BlueMelancholy
 * @desc:
 */
@Service
public class AttributeServiceImpl implements AttributeService {
	@Autowired
	private AttributeRepository attributeRepository;
	@Override
	public List<Attribute> getAttributes(int pageNum, int pageSize) {
		Sort sort = Sort.by(Sort.Direction.DESC,"attributeId");
		Pageable pageable = PageRequest.of(PageCalculator.calculateRowIndex(pageNum,pageSize),pageSize,sort);
		if (pageable != null && pageable.getPageNumber() > -1&& pageable.getPageSize() > -1) {
			Page<Attribute> attributePage = attributeRepository.findAll(pageable);
			return attributePage.getContent();
		}else {
			throw new AttributeException("页码有误");
		}
	}
}
