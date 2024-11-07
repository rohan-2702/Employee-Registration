package com.example.employee_registration.service;

import com.example.employee_registration.entity.Employee;
import com.example.employee_registration.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Transactional
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }


    public Employee login(String loginId, String password) {
        return employeeRepository.findByLoginIdAndPassword(loginId, password);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}

