package com.project.admin.repository;

import com.project.admin.domain.job.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository< Job, Long> {

}
