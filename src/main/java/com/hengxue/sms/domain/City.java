package com.hengxue.sms.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Unruly Wind on 2019/4/14/014.
 *
 * @author BlueMelancholy
 * @desc:	市实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class City implements Serializable {
	@Column(name = "id")
	private Integer id;
	private String cityName;
	@Id
	@Column(name = "city_id")
	private String cityId;
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "province_id",foreignKey = @ForeignKey(name = "none",value = ConstraintMode.NO_CONSTRAINT))
	private Province province;
}
