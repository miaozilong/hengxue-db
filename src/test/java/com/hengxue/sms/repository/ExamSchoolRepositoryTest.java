package com.hengxue.sms.repository;

import com.hengxue.sms.domain.ExamSchool;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

import static org.junit.Assert.*;

/**
 * Created by Unruly Wind on 2019/4/14/014.
 *
 * @author BlueMelancholy
 * @desc:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ExamSchoolRepositoryTest {
	@Autowired
	private ExamSchoolRepository examSchoolRepository;
	@Test
	public void testInsertExamSchool(){
		ExamSchool examSchool = new ExamSchool();
		examSchool.setExamSchoolId(UUID.randomUUID().toString());
		examSchool.setExamSchoolName("南京政治学院");
		ExamSchool school = examSchoolRepository.save(examSchool);
		System.out.println(school);
	}
}