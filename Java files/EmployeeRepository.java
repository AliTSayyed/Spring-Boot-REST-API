
/*
Spring Data JPA repositories are interfaces with methods that support creating, reading, updating, and deleting records against a back end data store.
By simply declaring the following EmployeeRepository interface we automatically will be able to
Create new Employees, Update existing ones, Delete Employees, Find Employees (one, all, or search by simple or complex properties)
*/

package com.example.Payroll;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> { 
    // need to specify the domain type as Employee and the id type as long
    // no methods needed, all methods come from the JPA Repository

}
