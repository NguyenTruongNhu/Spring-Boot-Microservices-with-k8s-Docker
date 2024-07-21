package com.ntndev.jobmicroservice.Job;


import com.ntndev.jobmicroservice.Job.dto.JobDTO;

import java.util.List;

public interface JobService {
    List<JobDTO> findAll();

    void createJob(Job  job);

    JobDTO getJobById(Long id);
    boolean deleteJobById(Long id);

    boolean updateJobById(Long id, Job updateJob);
}
