package com.springmvc.service;

import com.springmvc.entity.Employee;

public interface EmployeeService {

	public int addEmployee(Employee employee);
	
	public int updateEmployee(Employee employee);
	
	public Employee getEmployeeById(Long empId);
	
	
}
