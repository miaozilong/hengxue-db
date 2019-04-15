package com.hengxue.sms.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by Unruly Wind on 2019/4/14/014.
 *
 * @author BlueMelancholy
 * @desc: 省份实体
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = "province_name")})
public class Province {
	private Integer id;
	@Column(name = "province_name")
	private String provinceName;
	@Id
	@Column(name = "province_id")
	private String provinceId;
}
