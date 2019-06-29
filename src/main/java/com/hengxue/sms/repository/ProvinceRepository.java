package com.hengxue.sms.repository;

import com.hengxue.sms.domain.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Unruly Wind on 2019/4/14/014.
 *
 * @author BlueMelancholy
 * @desc:
 */
@Repository
public interface ProvinceRepository extends JpaRepository<Province,String> , PagingAndSortingRepository<Province,String > {
	/**
	 * 根据省名获取省
	 * @param provinceName
	 * @return
	 */
	Province findByProvinceName(String provinceName);
}
