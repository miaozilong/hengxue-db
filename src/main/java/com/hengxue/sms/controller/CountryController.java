package com.hengxue.sms.controller;

import com.hengxue.sms.domain.Country;
import com.hengxue.sms.service.CountryService;
import com.hengxue.sms.util.HttpServletRequestUtil;
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
@RequestMapping("/country")
public class CountryController {
	@Autowired
	private CountryService countryService;
	@GetMapping("/getcountriesbycityid")
	public Map<String,Object> getCountriesByCityId(HttpServletRequest request){
		String cityId = HttpServletRequestUtil.getString(request,"cityId");
		Map<String,Object> modelMap = Collections.synchronizedMap(new HashMap<>(10));
		if (cityId != null) {
			List<Country> countryList = countryService.getAllCountriesByCityId(cityId);
			if (countryList != null && countryList.size() > 0){
				modelMap.put("success",true);
				modelMap.put("countryList",countryList);
			}else{
				modelMap.put("success",false);
				modelMap.put("errMsg","无法查询到县区信息");
			}
		}else {
			modelMap.put("success",false);
			modelMap.put("errMsg","市的id号不能为空");
		}
		return modelMap;

	}
}
