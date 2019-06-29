package com.hengxue.sms.controller;

import com.hengxue.sms.domain.City;
import com.hengxue.sms.service.CityService;
import com.hengxue.sms.util.HttpServletRequestUtil;
import org.springframework.beans.BeanUtils;
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
@RequestMapping("/city")
public class CityController {
	@Autowired
	private CityService cityService;
	@GetMapping("/getcitiesbyprovinceid")
	public Map<String,Object> getCitiesProvinceId(HttpServletRequest request){
		String provinceId = HttpServletRequestUtil.getString(request, "provinceId");
		Map<String,Object> modelMap = Collections.synchronizedMap(new HashMap<>(10));
		if (provinceId != null){
			List<City> cityList = cityService.getAllCitiesByProvinceId(provinceId);
			if (cityList != null && cityList.size() > 0){
				modelMap.put("success",true);
				/**
				 * 会查出省份信息，这里可以使用Vo对象来封装返回给前端的数据，利用Spring的工具类BeanUtils.copyProperties()来拷贝属性
				 */
				modelMap.put("cityList",cityList);
			}else {
				modelMap.put("success",false);
				modelMap.put("errMsg","无法查询到市名");
			}
		}else {
			modelMap.put("success",false);
			modelMap.put("errMsg","省份id能为空");
		}
		return modelMap;
	}
}
