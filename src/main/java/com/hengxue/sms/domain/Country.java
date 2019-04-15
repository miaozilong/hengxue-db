package com.hengxue.sms.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by Unruly Wind on 2019/4/14/014.
 *
 * @author BlueMelancholy
 * @desc:	县区实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "country")
public class Country {
	@Column(name = "id")
	private Integer id;
	private String countryName;
	@Id
	private String countryId;
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "city_id",foreignKey = @ForeignKey(name = "none",value = ConstraintMode.NO_CONSTRAINT))
	private City city;
}
