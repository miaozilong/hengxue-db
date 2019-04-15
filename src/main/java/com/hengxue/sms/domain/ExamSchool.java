package com.hengxue.sms.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
<<<<<<< HEAD
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
=======
>>>>>>> 95a4e1aa2f387f246ea1660595e83ed52d760d0b
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
<<<<<<< HEAD
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer examSchoolId;
	private String examSchoolName;

=======
	private String examSchoolId;
	private String examSchoolName;
>>>>>>> 95a4e1aa2f387f246ea1660595e83ed52d760d0b
}
