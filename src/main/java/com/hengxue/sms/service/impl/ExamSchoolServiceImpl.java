package com.hengxue.sms.service.impl;

import com.hengxue.sms.domain.ExamSchool;
import com.hengxue.sms.exceptions.ExamSchoolException;
import com.hengxue.sms.repository.ExamSchoolRepository;
import com.hengxue.sms.service.ExamSchoolService;
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
public class ExamSchoolServiceImpl implements ExamSchoolService {
	@Autowired
	private ExamSchoolRepository examSchoolRepository;
	@Override
	public List<ExamSchool> getExamSchools() {
		Sort sort = Sort.by(Sort.Direction.DESC,"examSchoolId");
		List<ExamSchool> examSchoolList = examSchoolRepository.findAll(sort);
		return examSchoolList;
	}
}
