package com.hengxue.sms.service.impl;

import com.hengxue.sms.domain.Country;
import com.hengxue.sms.repository.CountryRepository;
import com.hengxue.sms.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Unruly Wind on 2019/4/15/015.
 *
 * @author BlueMelancholy
 * @desc:
 */
@Service
public class CountryServiceImpl implements CountryService {
	@Autowired
	private CountryRepository countryRepository;
	@Override
	public List<Country> getAllCountriesByCityId(String cityId) {
		return countryRepository.findAllByCity_CityId(cityId);
	}
}
