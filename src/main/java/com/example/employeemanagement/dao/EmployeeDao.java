package com.example.employeemanagement.dao;

import com.example.employeemanagement.models.Employee;

import java.util.ArrayList;
import java.util.List;

public interface EmployeeDao {

    public void addEmployee(Employee employeeToAdd);
    public List<Employee> getAllEmployees();
}
