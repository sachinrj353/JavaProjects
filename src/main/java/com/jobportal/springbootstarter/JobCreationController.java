package com.jobportal.springbootstarter;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobCreationController{
	
	@Autowired
	private JobService jobService;
	
	@RequestMapping("/jobs")
	public List<Job> getAllJobs(){
	 	return jobService.getAllJobs();
	}
	
	@RequestMapping("/jobs/{id}")
	public Job getJob(@PathVariable String id){
		return jobService.getJobs(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/jobs")
	public void addJobs(@RequestBody Job job){
		System.out.println("saving data");
		jobService.addJobs(job);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/jobs/{id}")
	public void updateJobs(@RequestBody Job job ,@PathVariable String id){
		jobService.updateJob(job, id);
	}

	@RequestMapping(method=RequestMethod.DELETE,value="/jobs/{id}")
	public void deleteJobs(@PathVariable String id){
		jobService.deleteJob(id);
	}
}
