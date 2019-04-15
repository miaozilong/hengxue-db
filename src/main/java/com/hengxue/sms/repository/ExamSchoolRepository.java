package com.hengxue.sms.repository;

import com.hengxue.sms.domain.ExamSchool;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Unruly Wind on 2019/4/14/014.
 *
 * @author BlueMelancholy
 * @desc:
 */
@Repository
<<<<<<< HEAD
public interface ExamSchoolRepository extends JpaRepository<ExamSchool,Integer> {
=======
public interface ExamSchoolRepository extends JpaRepository<ExamSchool,String> {
>>>>>>> 95a4e1aa2f387f246ea1660595e83ed52d760d0b
}
