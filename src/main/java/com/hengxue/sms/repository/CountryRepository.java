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
<<<<<<< HEAD
	@Query(nativeQuery = true,value = "select cou.country_id,cou.country_name,cou.id,c.city_id,c.id,c.city_name from country as cou inner join city as c on cou.city_id = c.city_id  order by c.city_name limit ?,?")
=======
	@Query(nativeQuery = true,value = "select cou.country_id,cou.country_name,cou.id,c.city_id from country as cou inner join city as c on cou.city_id = c.city_id  order by c.city_name limit ?,?")
>>>>>>> 95a4e1aa2f387f246ea1660595e83ed52d760d0b
	List<Country> findAllCountries(@Param("pageNum") int pageNum, @Param("pageSize") int pageSize);
}
