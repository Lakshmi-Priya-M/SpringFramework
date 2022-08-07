package com.spring.boot.controller;

import com.spring.boot.entity.Department;
import com.spring.boot.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department Save(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetch(){
        return departmentService.fetchDepartments();
    }

    @GetMapping("/departments/{departmentId}")
    public Department fetchById(@PathVariable Long departmentId){
        return departmentService.fetchDepartmentById(departmentId);
    }

    @DeleteMapping("/departments/{departmentId}")
    public String deleteById(@PathVariable Long departmentId){
        departmentService.deleteDepartmentById(departmentId);
        return "DepartmentId " + departmentId +" is deleted. ";
    }
}
