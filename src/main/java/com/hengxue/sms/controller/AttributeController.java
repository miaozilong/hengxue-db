package com.hengxue.sms.controller;

import com.hengxue.sms.domain.Attribute;
import com.hengxue.sms.service.AttributeService;
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
@RequestMapping("/attribute")
public class AttributeController {
	@Autowired
	private AttributeService attributeService;
	@GetMapping("/getattributes")
	public Map<String,Object> getAttributes(){
		Map<String,Object> modelMap = Collections.synchronizedMap(new HashMap<>(6));
		List<Attribute> attributeList = attributeService.getAttributes();
			if (attributeList != null && attributeList.size() > 0) {
				modelMap.put("attributeList",attributeList);
				modelMap.put("success",true);
			}else {
				modelMap.put("success",false);
				modelMap.put("errMsg","未查询到性质");
			}

		return modelMap;
	}
}
