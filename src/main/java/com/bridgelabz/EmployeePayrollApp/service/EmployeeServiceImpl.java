//package com.bridgelabz.EmployeePayrollApp.service;
//
//import java.util.List;
//import java.util.Optional;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.bridgelabz.EmployeePayrollApp.dto.EmployeeDTO;
//import com.bridgelabz.EmployeePayrollApp.exception.EmployeeNotFoundException;
//import com.bridgelabz.EmployeePayrollApp.model.Employee;
//import com.bridgelabz.EmployeePayrollApp.repository.EmployeeRepository;
//import lombok.extern.slf4j.Slf4j;
//
//@Slf4j
//@Service
//public class EmployeeServiceImpl implements EmployeeService {
//
//    @Autowired
//    private EmployeeRepository employeeRepository;
//
//    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
//        this.employeeRepository = employeeRepository;
//    }
//
//
//    @Override
//    public List<Employee> getAllEmployees() {
//        return employeeRepository.findAll();
//    }
//
//    @Override
//    public Employee getEmployeeById(Long id) {
//        return employeeRepository.findById(id)
//                .orElseThrow(() -> new EmployeeNotFoundException("Employee not found with ID: " + id));
//    }
//
//    @Override
//    public Employee addEmployee(EmployeeDTO employeeDTO) {
//        Employee employee = new Employee();
//        employee.setName(employeeDTO.name());
//        employee.setSalary(employeeDTO.salary());
//        return employeeRepository.save(employee);
//    }
//
//    @Override
//    public Employee updateEmployee(Long id, EmployeeDTO employeeDTO) {
//        Employee employee = getEmployeeById(id);
//        employee.setName(employeeDTO.name());
//        employee.setSalary(employeeDTO.salary());
//        return employeeRepository.save(employee);
//    }
//
//    @Override
//    public void deleteEmployee(Long id) {
//        employeeRepository.deleteById(id);
//    }
//}


package com.bridgelabz.EmployeePayrollApp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.EmployeePayrollApp.dto.EmployeeDTO;
import com.bridgelabz.EmployeePayrollApp.exception.EmployeeNotFoundException;
import com.bridgelabz.EmployeePayrollApp.model.Employee;
import com.bridgelabz.EmployeePayrollApp.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getAllEmployees() {
        log.info("Fetching all employees");
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        log.info("Fetching employee with ID: {}", id);
        return employeeRepository.findById(id)
                .orElseThrow(() -> {
                    log.error("Employee not found with ID: {}", id);
                    return new EmployeeNotFoundException("Employee not found with ID: " + id);
                });
    }

    @Override
    public Employee addEmployee(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
        employee.setName(employeeDTO.name());
        employee.setSalary(employeeDTO.salary());
        log.info("Adding new employee: {}", employee);
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(Long id, EmployeeDTO employeeDTO) {
        Employee employee = getEmployeeById(id);
        log.info("Updating employee with ID: {}", id);
        employee.setName(employeeDTO.name());
        employee.setSalary(employeeDTO.salary());
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
        log.warn("Deleting employee with ID: {}", id);
        employeeRepository.deleteById(id);
    }
}
