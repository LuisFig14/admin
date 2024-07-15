package com.project.admin.service.job;

import com.project.admin.domain.job.Job;
import com.project.admin.domain.job.ListDataJob;
import com.project.admin.domain.job.RegistrationDataJob;
import com.project.admin.domain.job.UpdateDataJob;
import com.project.admin.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JobServiceImpl implements JobService{

    @Autowired
    JobRepository jobRepository;


    @Override
    public Job createJob(RegistrationDataJob registrationDataJob) {

        Job job = new Job();
        job.setEventDate(registrationDataJob.getEventDate());
        job.setDescription(registrationDataJob.getDescription());

        return jobRepository.save(job);
    }

    @Override
    public Page<ListDataJob> getAllJob(Pageable pageable) {

        return jobRepository.findAll(pageable).map(ListDataJob::new);

    }

    @Override
    public Job getJobById(Long idJob) {

        Optional<Job> job = jobRepository.findById(idJob);

        if (job.isPresent()){
            return job.get();
        }else {
            throw new RuntimeException(idJob + " Not found");
        }
    }

    @Override
    public Job updateJob(Long id, UpdateDataJob updateDataJob) {

        Optional<Job> optionalJob = jobRepository.findById(id);

        if (optionalJob.isPresent()){
            Job job = optionalJob.get();

            job.setEventDate(updateDataJob.getEventDate());
            job.setDescription(updateDataJob.getDescription());

            return jobRepository.save(job);
        }else{
            throw new RuntimeException( id + "Not found update");
        }

    }
}
