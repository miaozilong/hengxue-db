package com.hengxue.sms.repository;

import com.hengxue.sms.domain.Attribute;
import org.junit.Assert;
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
public class AttributeRepositoryTest {
	@Autowired
	private AttributeRepository attributeRepository;
	@Test
	public void testInsertAttribute(){
		Attribute attribute = new Attribute(UUID.randomUUID().toString(),"专转本");
		Attribute attribute1 = attributeRepository.save(attribute);
		Assert.assertNotEquals(null,attribute1);
	}

}