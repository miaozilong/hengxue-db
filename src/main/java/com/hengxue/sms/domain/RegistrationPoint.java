package com.hengxue.sms.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Unruly Wind on 2019/4/15/015.
 *
 * @author BlueMelancholy
 * @desc:	报名点实体类
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationPoint {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer registrationPointId;
	private String registrationPointName;
}
