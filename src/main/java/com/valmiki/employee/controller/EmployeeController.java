package com.valmiki.employee.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.valmiki.employee.model.Employee;
import com.valmiki.employee.service.EmployeeService;
//import com.valmiki.employee.service.EmployeeServiceImpl;


@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:3000")
public class EmployeeController {

	private final EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService =  employeeService;
	}
	
	@PostMapping("/employees")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
}
