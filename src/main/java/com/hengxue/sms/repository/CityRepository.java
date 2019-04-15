package com.hengxue.sms.repository;

import com.hengxue.sms.domain.City;
import com.hengxue.sms.domain.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

/**
 * Created by Unruly Wind on 2019/4/14/014.
 *
 * @author BlueMelancholy
 * @desc:
 */
@Repository
public interface CityRepository extends JpaRepository<City,String> {
	@Query(nativeQuery = true,value = "select c.city_id,c.city_name,p.province_id,p.province_name,c.id,p.id from city as c inner join province as p on c.province_id = p.province_id order by p.province_name desc limit ?,?")
	List<City> findAllCities(@Param("pageNum") int pageNum, @Param("pageSize") int pageSize);
	List<City> findAllByProvince_ProvinceId(String provinceId);
}
