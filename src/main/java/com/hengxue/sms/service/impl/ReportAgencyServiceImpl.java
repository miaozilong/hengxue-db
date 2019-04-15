package com.hengxue.sms.service.impl;

import com.hengxue.sms.domain.ReportAgency;
import com.hengxue.sms.repository.ReportAgencyRepository;
import com.hengxue.sms.service.ReportAgencyService;
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
public class ReportAgencyServiceImpl implements ReportAgencyService {
	@Autowired
	private ReportAgencyRepository reportAgencyRepository;
	@Override
	public List<ReportAgency> getAllReportAgency() {
		Sort sort = Sort.by(Sort.Direction.DESC,"reportAgencyId");
		List<ReportAgency> reportAgencyList = reportAgencyRepository.findAll(sort);
		return reportAgencyList;
	}
}
