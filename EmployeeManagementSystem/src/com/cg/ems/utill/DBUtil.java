package com.cg.ems.utill;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashSet;
import java.util.Set;

import com.cg.ems.dto.Employee;

public class DBUtil
{

	public static HashSet<Employee>empSet=new HashSet<Employee>();
	static
	{
		empSet.add(new Employee(21073,"Harsh",90000.0F,LocalDate.of(2014,Month.AUGUST,24)));
		empSet.add(new Employee(21082,"xyb",86000.0F,LocalDate.of(2014,Month.AUGUST,11)));
		empSet.add(new Employee(21077,"Efg",76000.0F,LocalDate.of(2014,Month.AUGUST,31)));
		empSet.add(new Employee(21120,"mnb",88000.0F,LocalDate.of(2014,Month.AUGUST,19)));
		empSet.add(new Employee(21123,"uyt",78000.0F,LocalDate.of(2014,Month.AUGUST,18)));
	}
	public static Set<Employee>getAllEmp()
	{
		return empSet;
	}
	public static void addEmp(Employee ee)
	{
		empSet.add(ee);
		
	}
}
