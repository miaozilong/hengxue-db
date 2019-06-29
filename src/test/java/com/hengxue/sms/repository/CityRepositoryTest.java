package com.hengxue.sms.repository;

import com.hengxue.sms.domain.City;
import com.hengxue.sms.domain.Province;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
public class CityRepositoryTest {
	@Autowired
	private CityRepository cityRepository;
	@Test
	public void testQueryCities(){
		List<City> cityList = cityRepository.findAllCities(0, 10);
		System.out.println(cityList);
	}
	@Test
	public void testQueryCitiesByProvince(){
		String provinceId = "210000000000";
		List<City> cityList = cityRepository.findAllByProvince_ProvinceId(provinceId);
		System.out.println(cityList);
		System.out.println(cityList.size());
	}
}