package com.example.demo.service;

import com.example.demo.Entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public  Employee getEmployeeById(int id);

    public void deleteEmployee(int id);

}