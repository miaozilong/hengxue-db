package com.hengxue.sms.controller;

import com.hengxue.sms.domain.ReportAgency;
import com.hengxue.sms.service.ReportAgencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Unruly Wind on 2019/4/15/015.
 *
 * @author BlueMelancholy
 * @desc:
 */
@RestController
@RequestMapping("reportagency")
public class ReportAgencyController {
	@Autowired
	private ReportAgencyService reportAgencyService;
	@GetMapping("/getallreportagency")
	public Map<String,Object> getAllReportAgency(){
		Map<String,Object> modelMap = Collections.synchronizedMap(new HashMap<>(6));
		List<ReportAgency> reportAgencyList = reportAgencyService.getAllReportAgency();
		if (reportAgencyList != null && reportAgencyList.size() > 0){
			List<String> agencyNameList = reportAgencyList.stream().map(e -> e.getReportAgencyName()).collect(Collectors.toList());
			if (agencyNameList != null && agencyNameList.size() > 0){
				modelMap.put("success",true);
				modelMap.put("agencyNameList",agencyNameList);
			}else {
				modelMap.put("success",false);
				modelMap.put("errMsg","机构名为空");
			}
		}else {
			modelMap.put("success",false);
			modelMap.put("errMsg","上报机构未找到");
		}
		return modelMap;
	}
}
