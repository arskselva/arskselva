package com.app.training.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "DepartmentInfo")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "dept_code", length = 50)
	private String deptCode;

	@Column(name = "dept_name", length = 100)
	private String name;

	@Column(name = "dept_city", length = 100)
	private String city;

}
