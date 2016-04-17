package com.joshua.service;

import java.util.List;

import com.joshua.model.EmployeeVO;

public interface EmployeeService 
{
    List<EmployeeVO> getAllEmployees();
    
    EmployeeVO getEmployeeById(long id);
}
