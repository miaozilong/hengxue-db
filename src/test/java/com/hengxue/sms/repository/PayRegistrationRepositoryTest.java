package com.hengxue.sms.repository;

import com.hengxue.sms.domain.PayRegistration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by Unruly Wind on 2019/4/15/015.
 *
 * @author BlueMelancholy
 * @desc:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class PayRegistrationRepositoryTest {
	@Autowired
	private PayRegistrationRepository payRegistrationRepository;
	@Test
	public void testInsertPayRegistration(){
		PayRegistration payRegistration = new PayRegistration();
		payRegistration.setAmountReceivable(1000D);
		payRegistration.setAmountReceived(800D);
		payRegistration.setRemainReceivables(200D);
		payRegistration.setDifficultLevel("三级");
		payRegistration.setPayInstruction("第一次收费");
		payRegistration.setFirstCharge("第一次");
		payRegistration.setFirstChargeTime(new Date());
		PayRegistration registration = payRegistrationRepository.save(payRegistration);
		System.out.println(registration);
	}
}