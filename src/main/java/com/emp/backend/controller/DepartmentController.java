package com.emp.backend.controller;

import com.emp.backend.model.Department;
import com.emp.backend.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService = new DepartmentService();

    @GetMapping()
    List<Department> getAllUsers() {

        List<Department> departments  = departmentService.getAllDepartments();
        System.out.println(departments);
        return departments;
    }

    @PostMapping()
    Department createUser(){
        return departmentService.createDepartment(new Department());
    }
}
