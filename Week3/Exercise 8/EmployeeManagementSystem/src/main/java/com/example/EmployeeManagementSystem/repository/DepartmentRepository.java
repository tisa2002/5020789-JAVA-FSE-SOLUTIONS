package com.example.EmployeeManagementSystem.repository;

import com.example.EmployeeManagementSystem.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    // Derived query method to find departments by name
    Department findByName(String name);
}
