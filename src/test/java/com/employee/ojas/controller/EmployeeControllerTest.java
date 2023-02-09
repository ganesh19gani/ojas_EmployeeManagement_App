package com.employee.ojas.controller;

import com.employee.ojas.model.Employee;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import org.mockito.Mock;

import org.springframework.boot.test.context.SpringBootTest;


import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@SpringBootTest
public class EmployeeControllerTest {

    @Mock
    EmployeeController employeeController;

    private Employee getEmployee() {
        Employee emp = new Employee();
        emp.setEmployeeId(111L);
        emp.setEmployeeFirstName("Adapa");
        emp.setEmployeeLastName("Ganesh");
        emp.setEmployeeDesignation("Senior Software Engineer");
        return emp;
    }

    @Test
    public void saveEmployeeTest() {

        List<Employee> lemp = new ArrayList<>();

        Employee emp = getEmployee();

        lemp.add(emp);
        when(employeeController.saveEmployee(emp)).thenReturn(emp);
        Assert.assertEquals(1, lemp.size());
    }

    @Test
    public void getAllEmployeesTest() {

        List<Employee> lemp = new ArrayList<>();

        Employee emp = getEmployee();

        lemp.add(emp);

        when(employeeController.getAllEmployees()).thenReturn(lemp);
        Assert.assertEquals(1,lemp.size());

    }
}
