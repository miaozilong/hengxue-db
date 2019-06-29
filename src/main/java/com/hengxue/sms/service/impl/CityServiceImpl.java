package com.hengxue.sms.service.impl;

import com.hengxue.sms.domain.City;
import com.hengxue.sms.exceptions.CityException;
import com.hengxue.sms.repository.CityRepository;
import com.hengxue.sms.service.CityService;
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
public class CityServiceImpl implements CityService {
	@Autowired
	private CityRepository cityRepository;

	@Override
	public List<City> getAllCitiesByProvinceId(String provinceId) {
		return cityRepository.findAllByProvince_ProvinceId(provinceId);
	}
}
