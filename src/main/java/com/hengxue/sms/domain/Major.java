package com.hengxue.sms.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Unruly Wind on 2019/4/14/014.
 *
 * @author BlueMelancholy
 * @desc:	专业实体
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Major {
	@Id
	private String majorId;
	private String majorName;
}
