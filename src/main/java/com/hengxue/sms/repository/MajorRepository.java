package com.hengxue.sms.repository;

import com.hengxue.sms.domain.Major;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Unruly Wind on 2019/4/14/014.
 *
 * @author BlueMelancholy
 * @desc:
 */
@Repository
public interface MajorRepository extends JpaRepository<Major,String> {
}
