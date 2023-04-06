package com.bench.AzureAssignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureAssignmentApplication {

	

	public static void main(String[] args) {
		SpringApplication.run(AzureAssignmentApplication.class, args);
	}


}
