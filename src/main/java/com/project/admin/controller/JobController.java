package com.project.admin.controller;

import com.project.admin.domain.job.Job;
import com.project.admin.domain.job.ListDataJob;
import com.project.admin.domain.job.RegistrationDataJob;
import com.project.admin.service.job.JobService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/job")
public class JobController {

    @Autowired
    JobService jobService;


    @PostMapping
    public ResponseEntity<Job> createJob(@Valid @RequestBody RegistrationDataJob registrationDataJob){

        Job job = jobService.createJob(registrationDataJob);

        return new ResponseEntity<>(job, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Page<ListDataJob>> getAllJob(Pageable pageable){

        return ResponseEntity.ok(jobService.getAllJob(pageable));

    }

    @GetMapping("/{id}")
    public ResponseEntity<Job> getJobById(@PathVariable Long id){

        return ResponseEntity.ok(jobService.getJobById(id));

    }



}
