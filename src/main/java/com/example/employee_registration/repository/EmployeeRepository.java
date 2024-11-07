package com.example.employee_registration.repository;


import com.example.employee_registration.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Employee findByLoginIdAndPassword(String loginId, String password);
}

