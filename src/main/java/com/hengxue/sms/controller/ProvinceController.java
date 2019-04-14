package com.hengxue.sms.controller;

import com.hengxue.sms.domain.Province;
import com.hengxue.sms.service.ProvinceService;
import com.hengxue.sms.util.HttpServletRequestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Unruly Wind on 2019/4/14/014.
 *
 * @author BlueMelancholy
 * @desc:
 */
@RestController
@RequestMapping("/province")
public class ProvinceController {
	@Autowired
	private ProvinceService provinceService;
	@RequestMapping("/getallprovince")
	public Map<String,Object> getAllProvince(HttpServletRequest request){
		int pageNum = HttpServletRequestUtil.getInt(request, "pageNum");
		int pageSize = HttpServletRequestUtil.getInt(request, "pageSize");
		Pageable pageable = PageRequest.of(pageNum,pageSize);
		Map<String,Object> modelMap = Collections.synchronizedMap(new HashMap<>(6));
		List<Province> provinces = provinceService.getProvinces(pageNum,pageSize);
		if (provinces != null) {
			modelMap.put("provinces",provinces);
			modelMap.put("success",true);
		}else {
			modelMap.put("success",false);
			modelMap.put("errMsg","未找到省份");
		}
		return modelMap;
	}
}
