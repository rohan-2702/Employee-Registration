package com.example.employee_registration.controller;

import com.example.employee_registration.entity.Employee;
import com.example.employee_registration.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

    // This method will return the register.jsp view
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        // Create a new empty Employee object and pass it to the form
        model.addAttribute("employee", new Employee());
        return "registerForm";  // Return the JSP file name
    }

    @PostMapping("/register")
    public String processRegistration(@ModelAttribute Employee employee) {
        // Save the employee data to the database
        employeeService.saveEmployee(employee);

        // After saving, redirect to the login page
        return "redirect:/login";
    }
}
