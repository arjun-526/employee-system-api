package com.valmiki.employee.service;

import java.util.List;

import com.valmiki.employee.entity.EmployeeEntity;
import com.valmiki.employee.model.Employee;

public interface EmployeeService {

	Employee createEmployee(Employee employee);

	List<Employee> getAllEmployees();

}
