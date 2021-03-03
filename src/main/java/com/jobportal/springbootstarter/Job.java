package com.jobportal.springbootstarter;

import javax.persistence.Entity;

@Entity
public class Job {

	 @javax.persistence.Id
	 private String Id ="";
	 private String jobName="";
	 private String jobDescription="";
 
	 
	 public String getId() {
		return Id;  
 	}

	public void setId(String id) {
		Id = id;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public Job(String Id,String jobName, String jobDescription){
		 this.Id = Id;
		 this.jobName = jobName;
		 this.jobDescription = jobDescription;
	 }
}
