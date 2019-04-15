package com.hengxue.sms.repository;

import com.hengxue.sms.domain.City;
import com.hengxue.sms.domain.Country;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

/**
 * Created by Unruly Wind on 2019/4/14/014.
 *
 * @author BlueMelancholy
 * @desc:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class CountryRepositoryTest {
	@Autowired
	private CountryRepository countryRepository;
	@Test
	public void testQueryCounties(){
		List<Country> countryList = countryRepository.findAllCountries(0, 10);
		System.out.println(countryList);
		Set<City> cities = countryList.stream().map(e -> {
			return e.getCity();
		}).collect(Collectors.toSet());
		System.out.println(cities);
	}
	@Test
	public void testQueryCountriesByCityId(){
		String cityId = "320500000000";
		List<Country> countryList = countryRepository.findAllByCity_CityId(cityId);
		System.out.println(countryList.size());
		System.out.println(countryList);
	}
}