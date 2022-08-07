package com.spring.boot.service;

// One Service can have multiple implementations. The best practice is to create an interface.

import com.spring.boot.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> fetchDepartments();

    Department fetchDepartmentById(Long departmentId);

    void deleteDepartmentById(Long departmentId);
}
