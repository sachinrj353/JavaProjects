package com.jobportal.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan(basePackages={"com.jobportal."})
 
public class JobPortalApp {

	public static void main(String args[]){
		SpringApplication.run(JobPortalApp.class, args);
	}
}
