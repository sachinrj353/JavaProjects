package com.jobportal.springbootstarter;

import org.springframework.data.repository.CrudRepository;
 

public interface JobRepository extends CrudRepository<Job, String> {
 
}
