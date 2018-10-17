package com.cg.ems.ui;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import com.cg.ems.dto.Employee;
import com.cg.ems.exception.EmployeeException;
import com.cg.ems.service.EmployeeService;
import com.cg.ems.service.EmployeeServiceImpl;

public class TestEmpClient
{
	static EmployeeService empSer=null;
	static Scanner sc=null;

	public static void main(String[] args)
	{
		int choice;
		empSer=new EmployeeServiceImpl();
		sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("What Do U Want To Do?");
			System.out.println("1.Add Emp\t2.Get All Emp\n");
			System.out.println("3.Update Employee\t4.Get Emp By Id\n");
			System.out.println("5.Search Emp By Name\t6.Delete Emp\n");
			System.out.println("7.Exit");
			choice=sc.nextInt();
			
			performOperation(choice);
			
			
		}

	}

	private static void performOperation(int choice)
	{
	switch(choice)
	{
	case 1: addEmp();break;
	case 2: showEmpInfo();break;
	default: System.exit(0);
	}
		
	}

	private static void showEmpInfo()
	{
		Set<Employee>emp=empSer.fetchAllEmp();
		Iterator<Employee>itSet=emp.iterator();
		System.out.println("ID\\ttName\\ttSalary\\DateofJoin");
		System.out.println("------------------------------");
		while(itSet.hasNext())
		{
			Employee tempEmp=itSet.next();
			System.out.println(tempEmp.getEmpId()+"\t"+tempEmp.getEmpName()+"\t"+tempEmp.getEmpSal()+"\t"+tempEmp.getEmpDOJ());
			
		}
		System.out.println("-------------------------------");
	
		
	}

	private static void addEmp()
	{
		System.out.println("Enter Employee Name:");
		String ename=sc.next();
		int eid=0;
		float sal=0.0F;
		
		try {
			if(empSer.validateName(ename))
			{
				System.out.println("Enter Employee Id:");
				eid=sc.nextInt();
				System.out.println("Enter Salary:");
				sal=sc.nextFloat();
				Employee ee=new Employee(eid,ename,sal,null);
				empSer.addEmployee();
				
			}
		} catch (EmployeeException e) {
			e.printStackTrace();
		}
		
	}

}
