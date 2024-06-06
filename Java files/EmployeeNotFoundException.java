package com.example.Payroll;

// class for case where a missing id is called

class EmployeeNotFoundException extends RuntimeException {

  EmployeeNotFoundException(Long id) {
    super("Could not find employee " + id); 
  }
}
