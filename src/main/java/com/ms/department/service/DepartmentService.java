package com.ms.department.service;

import org.springframework.stereotype.Service;

import com.ms.department.entities.Department;
import com.ms.department.repos.DepartmentRepo;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepo departmentRepo;

	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepo.save(department);
	}

	public Department findDepartmentById(Long id) {
		return departmentRepo.findById(id).orElse(null);
	}
}
