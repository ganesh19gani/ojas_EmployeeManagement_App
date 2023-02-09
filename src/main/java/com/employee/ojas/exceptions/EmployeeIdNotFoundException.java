package com.employee.ojas.exceptions;

import java.util.function.Supplier;

public class EmployeeIdNotFoundException extends RuntimeException{
    public EmployeeIdNotFoundException(Long Id) {
        super("The Employee Id doesn't exist :"+Id);
    }
}
