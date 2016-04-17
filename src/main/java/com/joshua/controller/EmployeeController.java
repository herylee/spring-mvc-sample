package com.joshua.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.joshua.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService manager;
 
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String getAllEmployees(Model model) {
        model.addAttribute("employees", manager.getAllEmployees());
        return "employeesListDisplay";
    }
    
    @RequestMapping(value = "/view/{id}", method = RequestMethod.GET)
    public String get(@PathVariable("id") long id, Model model) {
    	model.addAttribute("employee", manager.getEmployeeById(id));
        return "getEmployeeById";

    }
}
