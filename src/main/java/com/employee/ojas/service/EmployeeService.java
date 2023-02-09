package com.employee.ojas.service;

import com.employee.ojas.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    Employee saveEmployee(Employee employee);

    List<Employee> getAllEmployees();


    Employee getEmployeeById(Long employeeId);

    Employee updateEmployeeById(Employee employee, Long employeeId);

    String deleteEmployeeById(Long employeeId);
}
