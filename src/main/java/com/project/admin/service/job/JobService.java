package com.project.admin.service.job;

import com.project.admin.domain.job.Job;
import com.project.admin.domain.job.ListDataJob;
import com.project.admin.domain.job.RegistrationDataJob;
import com.project.admin.domain.job.UpdateDataJob;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface JobService {

    //Create
    Job createJob(RegistrationDataJob registrationDataJob);

    //Read all
    Page <ListDataJob> getAllJob(Pageable pageable);

    //Read By id
    Job getJobById (Long idJob);

    //Update
    Job updateJob(Long id, UpdateDataJob updateDataJob);


}
