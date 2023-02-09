package com.employee.ojas.serviceImpl;

import com.employee.ojas.exceptions.EmployeeIdNotFoundException;
import com.employee.ojas.model.Employee;
import com.employee.ojas.repo.EmployeeRepo;
import com.employee.ojas.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    public EmployeeRepo employeeRepo;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee getEmployeeById(Long employeeId) {
        return employeeRepo.findById(employeeId).orElseThrow(() -> new EmployeeIdNotFoundException(employeeId));

    }

    @Override
    public Employee updateEmployeeById(Employee employee, Long employeeId) {
        return employeeRepo.findById(employeeId).map(updatedemployee -> {
            updatedemployee.setEmployeeFirstName(employee.getEmployeeFirstName());
            updatedemployee.setEmployeeLastName(employee.getEmployeeLastName());
            updatedemployee.setEmployeeDesignation(employee.getEmployeeDesignation());
            return employeeRepo.save(updatedemployee);
        }).orElseThrow(() -> new EmployeeIdNotFoundException(employeeId));

    }

    @Override
    public String deleteEmployeeById(Long employeeId) {
        if (!employeeRepo.existsById(employeeId)) {
            throw new EmployeeIdNotFoundException(employeeId);
        }
        employeeRepo.deleteById(employeeId);
        return "Employee Details Deleted Successfully " + employeeId;

    }

}



