package com.sartvas.spring.springboot.spring_boot_rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sartvas.spring.springboot.spring_boot_rest.entity.Employee;
import com.sartvas.spring.springboot.spring_boot_rest.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class MyController {
    @Autowired
    private EmployeeService employeeService;
    
    @GetMapping("/employees")
    public List<Employee> showAllEmployees(){
        List<Employee> allEmployees = employeeService.getAllEmployees();
        return allEmployees;
    } 
    
    @GetMapping("/employees/{id}")
   public Employee getEmployee(@PathVariable int id){
       Employee employee = employeeService.getEmployee(id);
       return employee;
   }
   
    @PostMapping("/employees")
   public Employee addNewEmployee(@RequestBody Employee employee){
       employeeService.saveEmployee(employee);
       return employee;
               
   }
   
    @PutMapping("/employees")
   public Employee updateEmployee(@RequestBody Employee employee){
       employeeService.saveEmployee(employee);
       return employee;
               
   }

}
