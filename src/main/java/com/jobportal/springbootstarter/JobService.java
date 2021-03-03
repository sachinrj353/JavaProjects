package com.jobportal.springbootstarter;
 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService {

    @Autowired
	private JobRepository jobRepository;
	
	private List<Job> listJobs = new ArrayList<>(Arrays.asList(
		 new Job("1","Java","Java experienced"),
		 new Job("2","DataScience","DataScience"),
		 new Job("3","Python","Python Developer"),
		 new Job("4","Angular","UI experienced")
		 ));
	
    public List<Job> getAllJobs(){
	 List<Job> listJobs = new ArrayList<>();
	 jobRepository.findAll().forEach(listJobs::add);
    
	 return listJobs;
	 //return listJobs;
   } 
 
   public Job getJobs(String id){
	 return listJobs.stream().filter(t -> id.equals(t.getId())).findFirst().get();
   }
	
   public void addJobs(Job job){
	   System.out.print("saving object");
	   jobRepository.save(job);
   }	
 
   public void updateJob(Job job, String id){
	 
	for(int i = 0;i<listJobs.size();i++){
		 Job jobObj = listJobs.get(i);
		if(jobObj.getId().equals(id)){
			listJobs.set(i, job);
			return;
			
   }
 }
	 
}	

  public void deleteJob(String id){
	 listJobs.removeIf(t->t.getId().equals(id));
 }
}
