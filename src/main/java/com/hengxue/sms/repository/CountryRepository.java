package com.hengxue.sms.repository;

import com.hengxue.sms.domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Unruly Wind on 2019/4/14/014.
 *
 * @author BlueMelancholy
 * @desc:
 */
public interface CountryRepository extends JpaRepository<Country,String> {
	@Query(nativeQuery = true,value = "select cou.country_id,cou.country_name,cou.id,c.city_id,c.id,c.city_name from country as cou inner join city as c on cou.city_id = c.city_id  order by c.city_name limit ?,?")
	List<Country> findAllCountries(@Param("pageNum") int pageNum, @Param("pageSize") int pageSize);
}
