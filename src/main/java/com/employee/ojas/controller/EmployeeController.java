package com.employee.ojas.controller;

import com.employee.ojas.model.Employee;
import com.employee.ojas.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class EmployeeController {

    @Autowired
    public EmployeeService employeeService;

    @PostMapping("/saveEmployee")
    public Employee saveEmployee(@RequestBody Employee employee) {

        return employeeService.saveEmployee(employee);

    }

    @GetMapping("/getAllEmployees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/getEmployeeById/{employeeId}")
    public Employee getEmployeeById(@PathVariable("employeeId") Long employeeId) {
        return employeeService.getEmployeeById(employeeId);
    }

    @PutMapping("/updateEmployeeById/{employeeId}")
    public Employee updateEmployeeById(@RequestBody Employee employee, @PathVariable("employeeId") Long employeeId) {
        return employeeService.updateEmployeeById(employee,employeeId);
    }

    @DeleteMapping("/deleteEmployeeById/{employeeId}")
    public String deleteEmployeeById(@PathVariable("employeeId") Long employeeId) {
        return employeeService.deleteEmployeeById(employeeId);
    }
}
