package com.springmvc.service;

import com.springmvc.entity.Employee;

public interface EmployeeService {

	public int addEmployee(Employee employee);
	
	public int deleteEmployee(Employee employee);
	
	public Employee getEmployeeById(Long empId);
	
	
}
