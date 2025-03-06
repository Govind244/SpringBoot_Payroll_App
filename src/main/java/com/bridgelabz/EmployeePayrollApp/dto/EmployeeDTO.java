package com.bridgelabz.EmployeePayrollApp.dto;

import jakarta.validation.constraints.*;

public record EmployeeDTO(
        @NotBlank(message = "Name cannot be empty") String name,
        @Min(value = 10000, message = "Salary must be at least 10,000") double salary
) {}
