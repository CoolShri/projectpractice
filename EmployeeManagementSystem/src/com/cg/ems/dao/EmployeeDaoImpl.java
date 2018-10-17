package com.cg.ems.dao;

import java.util.Set;

import com.cg.ems.dto.Employee;
import com.cg.ems.exception.EmployeeException;
import com.cg.ems.utill.DBUtil;

public class EmployeeDaoImpl implements EmployeeDao
{

	EmployeeDao empDao=null;
	
	public void EmployeeServiceImpl()
	{
		empDao=new EmployeeDaoImpl();
		
	}
	@Override
	public int addEmployee()
	{
	return 0;
	}
	public int addEmployee(Employee ee) throws EmployeeException
	{
				DBUtil.addEmp(ee);
				return ee.getEmpId();
	}

	@Override
	public Set<Employee> fetchAllEmp()
	{
		
		return null;
	}

	@Override
	public Employee searchEmpbyId(int eId)
	{
		
		return null;
	}

	@Override
	public Employee searchEmpByName(String eName)
	{
				return null;
	}

	@Override
	public int deleteEmp(int empId)
	{
		
		return 0;
	}

	
}
