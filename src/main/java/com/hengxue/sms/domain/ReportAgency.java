package com.hengxue.sms.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;

/**
 * Created by Unruly Wind on 2019/4/15/015.
 *
 * @author BlueMelancholy
 * @desc: 上报机构实体类
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ReportAgency {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer reportAgencyId;
	//上报单位名称
	private String reportAgencyName;
	//网址
	private String netAddress;
	//地址
	private String agencyLocation;
	//联系人
	private String contact;
	//联系电话

	private String contactNumber;
	//QQ号一
	private String qqNumberOne;
	//QQ号二
	private String qqNumberTwo;
	//邮箱
	@Email
	private String email;
	//外联机构代码
	private String outAgencyCode;

}
