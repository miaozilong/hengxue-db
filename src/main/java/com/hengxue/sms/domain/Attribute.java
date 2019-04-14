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
 * @desc:	考试性质实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Attribute {
	@Id
	private String attributeId;
	private String attributeName;
}
