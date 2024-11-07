package com.example.employee_registration.controller;

import com.example.employee_registration.entity.Employee;
import com.example.employee_registration.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/login")
    public String showLoginPage() {
        return "loginForm";
    }

    @PostMapping("/login")
    public String login(@RequestParam("loginId") String loginId,
                        @RequestParam("password") String password,
                        Model model) {
        Employee employee = employeeService.login(loginId, password);
        if (employee != null) {
            model.addAttribute("employee", employee); // Add employee to the model, will be stored in session automatically
            return "redirect:/welcome"; // Redirect to the welcome page after successful login
        } else {
            return "redirect:/login?error=true"; // Redirect back to login page on failure
        }
    }

    @GetMapping("/welcome")
    public String welcomePage(Model model, @SessionAttribute(name = "employee", required = false) Employee employee) {
        if (employee == null) {
            return "redirect:/login"; // Redirects to login if employee is not in session
        }

        model.addAttribute("employees", employeeService.getAllEmployees()); // Retrieve all employees
        return "welcome-page";  // Name of the JSP page to render
    }


    @GetMapping("/database")
    public String showDatabasePage(Model model) {
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "database-page";
    }
}

