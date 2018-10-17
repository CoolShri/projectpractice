package com.cg.ems.service;

import java.util.Set;
import java.util.regex.Pattern;

import com.cg.ems.dto.Employee;
import com.cg.ems.exception.EmployeeException;

public class EmployeeServiceImpl implements EmployeeService

{

	@Override
	public int addEmployee() throws EmployeeException
	{
		
		return 0;
	}

	@Override
	public Set<Employee> fetchAllEmp() {
		
		return null;
	}

	@Override
	public Employee searchEmpbyId(int eId) {
		
		return null;
	}

	@Override
	public Employee searchEmpByName(String eName) {
		
		return null;
	}

	@Override
	public int deleteEmp(int empId) {
		
		return 0;
	}

	@Override
	public boolean validateName(String name) throws EmployeeException
	{
		String namePattern="[A-Z][a-z]+";
		if(Pattern.matches(namePattern,name))
		{
			return true;
			
		}
		else
		{
			throw new EmployeeException("Invalid Name Should Start With Capital and Only characters are allowed");
		}
	}

	@Override
	public boolean validateDate(String date) throws EmployeeException {
		
		return false;
	}

	
	
}
