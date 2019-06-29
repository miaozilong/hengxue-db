package com.hengxue.sms.service;

import com.hengxue.sms.domain.Country;

import java.util.List;

/**
 * Created by Unruly Wind on 2019/4/15/015.
 *
 * @author BlueMelancholy
 * @desc:
 */
public interface CountryService {
	List<Country> getAllCountriesByCityId(String cityId);
}
