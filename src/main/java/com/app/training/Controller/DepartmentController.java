package com.app.training.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.training.Entity.Department;
import com.app.training.Service.DepartmentService;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/Departments")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departService;
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department)
	{
		Department depart = departService.saveDepartment(department);
		
		log.info ("Department added successfully");
		
		return depart;
	}
	
	@GetMapping("/{id}")
	public Department findDepartmentById(@PathVariable int id) {
		
		return departService.findDepartmentById(id);
	}
}
