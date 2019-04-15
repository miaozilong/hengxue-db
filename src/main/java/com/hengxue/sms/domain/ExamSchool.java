package com.hengxue.sms.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Unruly Wind on 2019/4/14/014.
 *
 * @author BlueMelancholy
 * @desc:	报考学校实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ExamSchool {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer examSchoolId;
	private String examSchoolName;

}
