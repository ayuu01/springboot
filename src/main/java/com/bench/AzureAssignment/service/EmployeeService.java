package com.bench.AzureAssignment.service;


import org.springframework.stereotype.Component;

import com.bench.AzureAssignment.entity.Employee;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeService {

	private static List<Employee> employeeList = new ArrayList<>();
	static {
		employeeList.add(new Employee(101, "Anu Gautam", 10000));
		employeeList.add(new Employee(102, "Ray Garg", 200000));
		employeeList.add(new Employee(103, "Aman Singh", 30000));
		employeeList.add(new Employee(104, "Radha Agrawal", 40000));
	}


    public List<Employee> getAllEmployee() {

        return employeeList;
    }
}