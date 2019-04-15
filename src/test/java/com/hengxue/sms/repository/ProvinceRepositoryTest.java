package com.hengxue.sms.repository;

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

import static org.junit.Assert.*;

/**
 * Created by Unruly Wind on 2019/4/14/014.
 *
 * @author BlueMelancholy
 * @desc:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ProvinceRepositoryTest {
	@Autowired
	private ProvinceRepository provinceRepository;
	@Test
	public void testQueryProvince(){
		Sort sort = Sort.by("id");
		Pageable pageable = PageRequest.of(0,20,sort);
		Page<Province> provincePage = provinceRepository.findAll(pageable);
		System.out.println(provincePage.getContent());
	}
}