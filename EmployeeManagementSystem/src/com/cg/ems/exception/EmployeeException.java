package com.cg.ems.exception;

public class EmployeeException extends Exception
{
	public EmployeeException(String msg)
	{
		super(msg);	
	}
	public EmployeeException() {
		super();
	}
	public EmployeeException(String msg, Throwable arg1, boolean arg2,
			boolean arg3) {
		super(msg, arg1, arg2, arg3);
	}

	public EmployeeException(String msg, Throwable arg1) {
		super(msg, arg1);
	}

	public EmployeeException(Throwable arg0) {
		super(arg0);
	}	
}
