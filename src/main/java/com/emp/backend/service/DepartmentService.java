package com.emp.backend.service;

import com.emp.backend.model.Department;
import com.emp.backend.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService implements DepartmentServiceInterface {

    @Autowired
    DepartmentRepository departmentRepository;
    @Override
    public List<Department> getAllDepartments() {
        try {
            return departmentRepository.findAll();
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return List.of();
    }

    @Override
    public Department createDepartment(Department department) {
        try {
            return departmentRepository.save(department);
        }
            catch (Exception e) {
            System.out.println(e);
        }
        return department;
    }
}
