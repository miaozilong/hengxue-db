package com.hengxue.sms.controller;

import com.hengxue.sms.domain.RegistrationPoint;
import com.hengxue.sms.service.RegistrationPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Unruly Wind on 2019/4/15/015.
 *
 * @author BlueMelancholy
 * @desc:
 */
@RestController
@RequestMapping("/registrationpoint")
public class RegistrationPointController {
	@Autowired
	private RegistrationPointService registrationPointService;
	@GetMapping("/getallregistrationpoint")
	public Map<String,Object> getAllRegistrationPoint(){
		Map<String,Object> modelMap = Collections.synchronizedMap(new HashMap<>(6));
		List<RegistrationPoint> registrationPointList = registrationPointService.getAllRegistrationPoint();
		if (registrationPointList != null && registrationPointList.size() > 0) {
			modelMap.put("success",true);
			modelMap.put("registrationPointList",registrationPointList);
		}else {
			modelMap.put("success",false);
			modelMap.put("errMsg","未找到报名点");
		}
		return modelMap;
	}
}
