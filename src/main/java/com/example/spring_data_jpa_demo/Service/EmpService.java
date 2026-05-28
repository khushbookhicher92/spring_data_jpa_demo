package com.example.spring_data_jpa_demo.Service;

import com.example.spring_data_jpa_demo.model.Employee;

import java.util.ArrayList;

public interface EmpService {
    ArrayList<Employee> findAllEmployee();
    Employee findAllEmployeeByID(long id);
     void addEmployee(Employee employee);
     void deleteAllData();



//    public  Employee findAllEmployeeByID(long id);
}
