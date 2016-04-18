package com.joshua.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.joshua.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService service;
 
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String getAllEmployees(Model model) {
        model.addAttribute("employees", service.getAllEmployees());
        return "employeesListDisplay";
    }
    
    @RequestMapping(value = "/view/{id}", method = RequestMethod.GET)
    public ModelAndView get(@PathVariable("id") long id,HttpServletRequest request, Model model) {
    	return new ModelAndView("getEmployeeById")
    			  .addObject("employee", service.getEmployeeById(id));
    }
}
