package com.bench.AzureAssignment.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Employee{
    private int employeeId;
    private String employeeName;
    private int employeeSalary;

    public Employee(int employeeId,String employeeName, int employeeSalary){
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.employeeSalary=employeeSalary;
    }

    public int getEmployeeId(){
        return employeeId;
    }
    public int getEmployeeSalary(){
        return employeeSalary;
    }
    public String getEmployeeName(){
        return employeeName;
    }

    public String toString(){
        return employeeId+" "+employeeName+" "+employeeSalary;
    }

}
