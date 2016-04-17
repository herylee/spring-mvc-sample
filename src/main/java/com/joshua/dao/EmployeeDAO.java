package com.joshua.dao;

import java.util.List;

import com.joshua.model.EmployeeVO;

public interface EmployeeDAO
{
    public List<EmployeeVO> getAllEmployees();
    
    public EmployeeVO getEmployeeById(long id);
}
