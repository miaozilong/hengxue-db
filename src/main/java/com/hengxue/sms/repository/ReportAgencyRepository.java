package com.hengxue.sms.repository;

import com.hengxue.sms.domain.ReportAgency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Unruly Wind on 2019/4/15/015.
 *
 * @author BlueMelancholy
 * @desc:
 */
@Repository
public interface ReportAgencyRepository extends JpaRepository<ReportAgency,Integer> {
}
