package com.hengxue.sms.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by Unruly Wind on 2019/4/15/015.
 *
 * @author BlueMelancholy
 * @desc:	收付款登记实体类
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class PayRegistration {
	//ID号
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer payRegistrationId;
	//应收金额
	private Double amountReceivable;
	//已收金额
	private Double amountReceived;
	//剩余应收额
	private Double remainReceivables;
	//难易级别
	private String difficultLevel;
	//交费说明
	private String payInstruction;
	//第一次收费
	private Date firstCharge;
	//第二次收费
	private Date secondCharge;
	//第三次收费
	private Date thirdCharge;
	//第四次收费
	private Date fourthCharge;
	//第五次收费
	private Date fifthCharge;
	//第一次收费日期
	private Date fisrtChargeTime;
	//第二次收费日期
	private Date secondChargeTime;
	//第三次收费日期
	private Date thirdtChargeTime;
	//第四次收费日期
	private Date fourthChargeTime;
	//第五次收费日期
	private Date fifthChargeTime;
}
