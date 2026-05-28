package com.example.spring_data_jpa_demo;

import com.example.spring_data_jpa_demo.Service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataJpaDemoApplication  {


    @Autowired
    private EmpService empService;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaDemoApplication.class, args);
    }

//    @Override
//    public void run(String... args) throws Exception {
//        // This will automatically insert your hardcoded data on startup!
//        empService.addEmployee();
//
//
//    }
}
