package com.sartvas.spring.springboot.spring_boot_rest.service;

import java.util.List;

import com.sartvas.spring.springboot.spring_boot_rest.entity.Employee;

public interface EmployeeService {
	
  public List<Employee> getAllEmployees();
    
  public void saveEmployee(Employee employee);
  
  public Employee getEmployee(int id);
  
  public void deleteEmolyee(int id);
}
