package com.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.dao.EmployeeRepository;

import com.springmvc.entity.Employee;

@Component
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired	
	private EmployeeRepository employeeRepository;

	@Transactional
	public int addEmployee(Employee employee) {
		employeeRepository.save(employee);
		return 0;
	}

	public Employee getEmployeeById(Long empId) {
		Employee emp = employeeRepository.findOne(empId);
		return emp;
	}


	public int updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
				return 0;
	}

	public int deleteEmployee(Employee employee) {

		// TODO Auto-generated method stub
		return 0;
	}

}
