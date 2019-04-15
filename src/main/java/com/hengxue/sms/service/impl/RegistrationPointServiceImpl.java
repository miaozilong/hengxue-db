package com.hengxue.sms.service.impl;

import com.hengxue.sms.domain.RegistrationPoint;
import com.hengxue.sms.repository.RegistrationPointRepository;
import com.hengxue.sms.service.RegistrationPointService;
import org.springframework.beans.factory.annotation.Autowired;
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
public class RegistrationPointServiceImpl implements RegistrationPointService {
	@Autowired
	private RegistrationPointRepository registrationPointRepository;

	@Override
	public List<RegistrationPoint> getAllRegistrationPoint() {
		Sort sort = Sort.by(Sort.Direction.DESC,"registrationPointId");
		List<RegistrationPoint> registrationPointList = registrationPointRepository.findAll(sort);
		return registrationPointList;
	}
}
