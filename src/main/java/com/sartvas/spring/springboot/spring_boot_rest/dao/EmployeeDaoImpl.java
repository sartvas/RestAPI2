package com.sartvas.spring.springboot.spring_boot_rest.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sartvas.spring.springboot.spring_boot_rest.entity.Employee;


@Repository
public class EmployeeDaoImpl implements EmployeeDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Employee> getAllEmployees() {
        
        Session session = entityManager.unwrap(Session.class); //unlike JPA in Hibernate session is entityManager 
		Query<Employee>  query = session.createQuery("from Employee", Employee.class);
        List<Employee> allEmployees = query.getResultList();
        
        return allEmployees;
    }

    @Override
    public void saveEmployee(Employee employee) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(employee);
    }

    @Override
    public Employee getEmployee(int id) {
        Session session = entityManager.unwrap(Session.class);
        Employee employee = session.get(Employee.class, id);
         return employee;
    }

    @Override
    public void deleteEmolyee(int id) {
        Session session = entityManager.unwrap(Session.class);
        Query query = session.createQuery("DELETE FROM Employee " + 
                   "WHERE id =:eploeeID");
        query.setParameter("eploeeID", id);
        query.executeUpdate(); 
    }
	

}
