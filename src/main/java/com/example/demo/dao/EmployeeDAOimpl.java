package com.example.demo.dao;

import com.example.demo.Entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
//import org.hibernate.Session;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOimpl implements EmployeeDAO {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<Employee> getAllEmployee() {
//        Session session = entityManager.unwrap(Session.class);
//        return session.createQuery("from Employee", Employee.class).list();

        Query query = entityManager.createQuery("from Employee");
        List<Employee> resultList = query.getResultList();
        return resultList;




    }

    @Override
    public void saveEmployee(Employee employee) {
//        Session session = entityManager.unwrap(Session.class);
//        session.merge(employee);
        entityManager.merge(employee);

    }

    @Override
    public Employee getEmployeeById(int id) {
//        Session session = entityManager.unwrap(Session.class);
//        return session.get(Employee.class, id);
        Employee employee = entityManager.find(Employee.class, id);
        return employee;

    }

    @Override
    public void deleteEmployee(int id) {
//        Session session = entityManager.unwrap(Session.class);
//        session.remove(getEmployeeById(id));
        entityManager.remove(entityManager.find(Employee.class, id));
    }
}
