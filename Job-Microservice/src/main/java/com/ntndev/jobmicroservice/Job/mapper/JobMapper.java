package com.ntndev.jobmicroservice.Job.mapper;

import com.ntndev.jobmicroservice.Job.Job;
import com.ntndev.jobmicroservice.Job.dto.JobDTO;
import com.ntndev.jobmicroservice.Job.external.Company;
import com.ntndev.jobmicroservice.Job.external.Review;

import java.util.List;

public class JobMapper {
    public static JobDTO mapToJobWithCompanyDTO(Job job, Company company, List<Review> reviews) {
       JobDTO jobDTO = new JobDTO();
            jobDTO.setId(job.getId());
            jobDTO.setTitle(job.getTitle());
            jobDTO.setDescription(job.getDescription());
            jobDTO.setMinSalary(job.getMinSalary());
            jobDTO.setMaxSalary(job.getMaxSalary());
            jobDTO.setLocation(job.getLocation());
            jobDTO.setCompany(company);
            jobDTO.setReview(reviews);


            return jobDTO;




    }
}
