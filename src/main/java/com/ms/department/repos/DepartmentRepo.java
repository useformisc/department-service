package com.ms.department.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ms.department.entities.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long> {

}
