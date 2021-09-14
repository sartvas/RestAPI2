package com.sartvas.spring.springboot.spring_boot_rest.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sartvas.spring.springboot.spring_boot_rest.dao.EmployeeDAO;
import com.sartvas.spring.springboot.spring_boot_rest.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDAO employeeDAO; 

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
       return employeeDAO.getAllEmployees();
    }
    
    @Override
    @Transactional
    public void saveEmployee(Employee employee){
        employeeDAO.saveEmployee(employee);
    
}

    @Override
    @Transactional
    public Employee getEmployee(int id) {
        return employeeDAO.getEmployee(id);
    }

    @Override
    @Transactional
    public void deleteEmolyee(int id) {
        employeeDAO.deleteEmolyee(id);
    }
}
