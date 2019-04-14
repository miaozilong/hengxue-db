package com.hengxue.sms.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by Unruly Wind on 2019/4/14/014.
 *
 * @author BlueMelancholy
 * @desc:	政治面貌实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = "political_status_name")})
public class PoliticalStatus {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String politicalStatusId;
	@Column(name = "political_status_name",columnDefinition = "varchar(50) comment '政治面貌'")
	private String politicalStatusName;
}
