package com.example.employeemanagement.services;

import com.example.employeemanagement.dao.EmployeeDao;
import com.example.employeemanagement.models.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class EmployeeDaoService implements EmployeeDao {

    List<Employee> employeeList = new ArrayList<>();

    @Override
    public void addEmployee(Employee employeeToAdd) {
        employeeList.add(employeeToAdd);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeList;
    }
}
