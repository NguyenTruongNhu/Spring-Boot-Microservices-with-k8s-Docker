package com.ntndev.jobmicroservice.Job;


import org.springframework.data.jpa.repository.JpaRepository;


public interface JobRepository extends JpaRepository<Job, Long> {

}
