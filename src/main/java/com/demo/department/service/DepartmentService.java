package com.demo.department.service;

import com.demo.department.entity.Department;

import java.util.List;

public interface DepartmentService {
   public Department saveDepartment(Department department);

  public List<Department> fetchDepartmentList();

   public Department fetchDepartmentById(Long departmentId);
}
