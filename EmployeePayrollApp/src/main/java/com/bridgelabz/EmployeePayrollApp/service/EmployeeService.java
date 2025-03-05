package com.bridgelabz.EmployeePayrollApp.service;

import java.util.List;
import com.bridgelabz.EmployeePayrollApp.dto.EmployeeDTO;
import com.bridgelabz.EmployeePayrollApp.model.Employee;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long id);
    Employee addEmployee(EmployeeDTO employeeDTO);
    Employee updateEmployee(Long id, EmployeeDTO employeeDTO);
    void deleteEmployee(Long id);
}
