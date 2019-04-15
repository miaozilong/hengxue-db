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
<<<<<<< HEAD
	@Test
	public void testQueryCounties(){
		List<Country> countryList = countryRepository.findAllCountries(0, 10);
		System.out.println(countryList);
		Set<City> cities = countryList.stream().map(e -> {
			return e.getCity();
		}).collect(Collectors.toSet());
		System.out.println(cities);
=======
	@Autowired
	private CityRepository cityRepository;
	@Test
	public void testQueryCounties(){
		List<Country> countryList = countryRepository.findAllCountries(0, 10);
		Set<City> citySet = countryList.stream().map(e -> {
			System.out.println(e);
			Optional<City> optionalCity = cityRepository.findById(e.getCityId());
			City city = optionalCity.get();
			return city;
		}).collect(Collectors.toSet());
		System.out.println(citySet);
>>>>>>> 95a4e1aa2f387f246ea1660595e83ed52d760d0b
	}
}