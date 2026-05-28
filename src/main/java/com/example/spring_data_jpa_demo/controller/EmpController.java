package com.example.spring_data_jpa_demo.controller;

import com.example.spring_data_jpa_demo.Service.EmpServiceImpl;
import com.example.spring_data_jpa_demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EmpController {

    @Autowired
    EmpServiceImpl empServiceImpl;

    @PostMapping("/add")
    public String add(@RequestBody Employee employee) {
        empServiceImpl.addEmployee(employee);
        return "Employee added successfully!";
    }

    @GetMapping("/findall")
    public ArrayList<Employee> getAllEmployee() {
        return empServiceImpl.findAllEmployee();
    }

    @GetMapping("/findbyid/{id}")
    public Employee getEmployeeUsingId(@PathVariable long id) {
        return empServiceImpl.findAllEmployeeByID(id);
    }
//    @PostMapping("/add")
//    public String addEmployees() {
//        empServiceImpl.addEmployee();
//        return "Hardcoded employees added successfully!";
//    }
    @DeleteMapping("/delete")
    public void delete() {
        empServiceImpl.deleteAllData();
    }
}
