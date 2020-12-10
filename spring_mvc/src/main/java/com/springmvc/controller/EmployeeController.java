package com.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springmvc.entity.Employee;
import com.springmvc.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/{empId}")
	public Employee retrieveEmployee(@PathVariable long empId) {
		return employeeService.getEmployeeById(empId);
	}

	@PostMapping("/add")
	public ResponseEntity<String> addOrUpdateEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);

		return new ResponseEntity<String>("Response from POST method", HttpStatus.OK);
	}
	
	
	public static void main(String args[]) {
		
	}
}
