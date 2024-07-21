package com.example.demo.dao;

import com.example.demo.Entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> getAllEmployee();

    public void saveEmployee(Employee employee);

    public Employee getEmployeeById(int id);

    public void deleteEmployee(int id);
}
