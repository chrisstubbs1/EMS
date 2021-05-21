package com.example.employeemanagement.controllers;

import com.example.employeemanagement.models.Employee;
import com.example.employeemanagement.services.EmployeeDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
public class EmployeeController {

    final EmployeeDaoService employeeDaoService;

    public EmployeeController(EmployeeDaoService employeeDaoService) {
        this.employeeDaoService = employeeDaoService;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String addNewEmployee(ModelMap map) {
        employeeDaoService.addEmployee(new Employee("Joe", "Johnson", "Joe Johnson",
                "jj@gmail.com", 12));
        map.addAttribute("employees", employeeDaoService.getAllEmployees());

        return "index :: employee-row";
    }

    @DeleteMapping
    public String deleteEmployeeById(@PathVariable("id") int id) {
        employeeDaoService.getAllEmployees().remove(id);
        return "index :: employee-row";
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("employees", employeeDaoService.getAllEmployees());
        return "index";
    }
}
