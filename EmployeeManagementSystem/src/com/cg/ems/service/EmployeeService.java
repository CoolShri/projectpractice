package com.cg.ems.service;

import java.util.Set;

import com.cg.ems.dto.Employee;
import com.cg.ems.exception.EmployeeException;

public interface EmployeeService
{
	public int addEmployee() throws EmployeeException;
	public Set<Employee>fetchAllEmp();
	public Employee searchEmpbyId(int eId);
	public Employee searchEmpByName(String eName);
	public int deleteEmp(int empId);
	public boolean validateName(String name) throws EmployeeException;
	public boolean validateDate(String date) throws EmployeeException;
	
}
