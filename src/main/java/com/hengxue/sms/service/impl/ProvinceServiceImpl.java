package com.hengxue.sms.service.impl;

import com.hengxue.sms.domain.Province;
import com.hengxue.sms.exceptions.ProvinceException;
import com.hengxue.sms.repository.ProvinceRepository;
import com.hengxue.sms.service.ProvinceService;
import com.hengxue.sms.util.PageCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * Created by Unruly Wind on 2019/4/14/014.
 *
 * @author BlueMelancholy
 * @desc:
 */
@Service
public class ProvinceServiceImpl implements ProvinceService {
	@Autowired
	private ProvinceRepository provinceRepository;
	@Override
	public List<Province> getProvinces() {
		Sort sort = Sort.by(Sort.Direction.DESC,"provinceId");
		List<Province> provinceList = provinceRepository.findAll(sort);
		return provinceList;
	}
}
