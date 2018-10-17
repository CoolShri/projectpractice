package com.cg.ems.dao;

import java.util.Set;

import com.cg.ems.dto.Employee;
import com.cg.ems.exception.EmployeeException;

public interface EmployeeDao
{

	public int addEmployee() throws EmployeeException;
	public Set<Employee>fetchAllEmp();
	public Employee searchEmpbyId(int eId);
	public Employee searchEmpByName(String eName);
	public int deleteEmp(int empId);
	
}
