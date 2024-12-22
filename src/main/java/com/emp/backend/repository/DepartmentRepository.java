package com.emp.backend.repository;

import com.emp.backend.model.Department;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends MongoRepository<Department, String> {

}