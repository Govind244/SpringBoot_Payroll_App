package com.bridgelabz.EmployeePayrollApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bridgelabz.EmployeePayrollApp.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
