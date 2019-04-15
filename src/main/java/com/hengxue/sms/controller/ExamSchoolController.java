package com.hengxue.sms.controller;

import com.hengxue.sms.domain.ExamSchool;
import com.hengxue.sms.service.ExamSchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
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
@RequestMapping("/examschool")
public class ExamSchoolController {
	@Autowired
	private ExamSchoolService examSchoolService;
	@GetMapping("/getexamschools")
	public Map<String,Object> getExamSchools(){
		Map<String,Object> modelMap = Collections.synchronizedMap(new HashMap<>(6));
		List<ExamSchool> examSchoolList = examSchoolService.getExamSchools();
		if (examSchoolList != null && examSchoolList.size() > 0){
			modelMap.put("success",true);
			modelMap.put("examSchoolList",examSchoolList);
		}else {
			modelMap.put("success",false);
			modelMap.put("errMsg","未找到报考学校");
		}
		return modelMap;
	}
}
