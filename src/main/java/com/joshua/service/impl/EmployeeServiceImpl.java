package com.joshua.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joshua.dao.EmployeeDAO;
import com.joshua.model.EmployeeVO;
import com.joshua.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
 
    @Autowired
    EmployeeDAO dao;
     
    public List<EmployeeVO> getAllEmployees() 
    {
        return dao.getAllEmployees();
    }

	public EmployeeVO getEmployeeById(long id) {
		return dao.getEmployeeById(id);
	}
}
