package com.emp.backend.service;

import com.emp.backend.model.Department;

import java.util.List;

public interface DepartmentServiceInterface {
    List<Department> getAllDepartments();
    Department createDepartment(Department department);
}