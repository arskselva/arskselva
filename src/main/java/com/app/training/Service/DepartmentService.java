package com.app.training.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.training.Entity.Department;
import com.app.training.Repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepo;

	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepo.save(department);
	}

	public Department findDepartmentById(int id) {
		// TODO Auto-generated method stub
		return departmentRepo.findById(id).get();
	}
	
}
