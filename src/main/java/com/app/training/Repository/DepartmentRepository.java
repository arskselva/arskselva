package com.app.training.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.training.Entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{
	
	

}
