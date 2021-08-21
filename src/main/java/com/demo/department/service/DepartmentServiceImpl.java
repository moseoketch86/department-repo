package com.demo.department.service;

import com.demo.department.entity.Department;
import com.demo.department.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    private DepartmentRepository departmentRepository;


    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }
}
