package com.divergentsl.hms.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divergentsl.hms.dao.CRUDEmployeeDao;
import com.divergentsl.hms.entity.Employee;

@Service
public class CRUDEmployeeServiceImpl implements CRUDEmployeeService {

	@Autowired
	private CRUDEmployeeDao employeeDao;
	
	@Transactional
	@Override
	public void add(int employeeId, String employeeName, String loginId, String password, String employeeType, String status) {
		
		Employee employee = new Employee();
		employee.setEmployeeId(employeeId);
		employee.setEmployeeName(employeeName);
		employee.setLoginId(loginId);
		employee.setPassword(password);
		employee.setEmployeeType(employeeType);
		employee.setStatus(status);
		
		employeeDao.add(employee);
	}

}
