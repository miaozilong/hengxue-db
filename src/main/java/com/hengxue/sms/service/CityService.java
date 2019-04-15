package com.hengxue.sms.service;

import com.hengxue.sms.domain.City;

import java.util.List;

/**
 * Created by Unruly Wind on 2019/4/15/015.
 *
 * @author BlueMelancholy
 * @desc:
 */
public interface CityService {
	List<City> getAllCitiesByProvinceId(String provinceId);
}
