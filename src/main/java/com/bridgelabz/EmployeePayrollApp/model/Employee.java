//package com.bridgelabz.EmployeePayrollApp.model;
//
//import jakarta.persistence.*;
//import jakarta.validation.constraints.*;
//
//@Entity
//@Table(name = "employees")
//public class Employee {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @NotBlank(message = "Name cannot be empty")
//    private String name;
//
//    @Min(value = 10000, message = "Salary must be at least 10,000")
//    private double salary;
//
//    public Employee() {}
//
//    public Employee(String name, double salary) {
//        this.name = name;
//        this.salary = salary;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//}


package com.bridgelabz.EmployeePayrollApp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Table(name = "employees")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name cannot be empty")
    private String name;

    @Min(value = 10000, message = "Salary must be at least 10,000")
    private double salary;
}

