package com.employee.ojas.advice;

import com.employee.ojas.exceptions.EmployeeIdNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ResponseBody
    @ExceptionHandler(EmployeeIdNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String, String> employeeIdNotFoundException(EmployeeIdNotFoundException employeeIdNotFoundException) {
        Map<String, String> exception = new HashMap<>();
        exception.put("errorMessage", employeeIdNotFoundException.getMessage());
        return exception;
    }
}
