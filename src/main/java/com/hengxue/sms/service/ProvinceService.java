package com.hengxue.sms.service;

import com.hengxue.sms.domain.Province;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by Unruly Wind on 2019/4/14/014.
 *
 * @author BlueMelancholy
 * @desc:
 */
public interface ProvinceService {
	List<Province> getProvinces();
}
