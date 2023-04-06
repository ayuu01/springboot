package com.bench.AzureAssignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bench.AzureAssignment.entity.Employee;
import com.bench.AzureAssignment.service.EmployeeService;

import java.util.List;

@RestController
public class EmployeeController {

    @GetMapping("/test")
    public String handleTest(){
        return "home";
    }

    @Autowired
    private EmployeeService employeeService;

//    @PostMapping("/api/v1/employee")
//    public Employee createEmployee(@RequestBody Employee employeeEntity){
//
//        Employee emp=this.employeeService.createEmployee(employeeEntity);
//        return emp;
//    }


    @GetMapping("/employees")
    public List<Employee> getEmployees(){

        return this.employeeService.getAllEmployee();
    }




}