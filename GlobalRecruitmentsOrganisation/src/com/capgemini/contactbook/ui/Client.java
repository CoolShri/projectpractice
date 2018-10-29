package com.capgemini.contactbook.ui;

import java.util.Random;
import java.util.Scanner;

import com.capgemini.contactbook.exception.ContactBookException;
import com.capgemini.contactbook.service.ContactBookServiceImpl;
import com.igate.contactbook.bean.EnquiryBean;

public class Client {
static Scanner sc=null;
static ContactBookServiceImpl conSer=null;
	public static void main(String[] args) throws ContactBookException {
		sc=new Scanner(System.in);
		conSer=new ContactBookServiceImpl();
		int choice;
		while(true){
	System.out.println("1.Add Enquiry");
	System.out.println("2.Search Enquiry");
	System.out.println("3.Exit");
	System.out.println("Enter Your Choice");
	choice=sc.nextInt();
	performOperation(choice);

	}
	}
	private static void performOperation(int choice) throws ContactBookException {
switch(choice)
{
case 1: addEnquiry(); break;
case 2: EnquiryDetails(); break;
default: System.exit(0);
}
	}
	private static void EnquiryDetails() throws ContactBookException 
	{
		
		System.out.println("Enter the Enquiry ID");
		int qid = sc.nextInt();
		EnquiryBean b=conSer.getEnquiryDetails(qid);
		if(b!=null)
		{	
		System.out.println(b);
		}
	else
		System.out.println("Fuck offf!!!!!");
		
	}
	private static void addEnquiry() throws ContactBookException {
		Random rand=new Random();
		int eid=Math.abs(rand.nextInt());
		System.out.println("Enter Your Details");
		
		System.out.println("Enter first name");
		String fname=sc.next();
		
		
		System.out.println("enter last name");
		String lname=sc.next();
		System.out.println("Enter phone numberr");
		String cnum=sc.next();
		System.out.println("enter loction");
		String locname=sc.next();
		System.out.println("enter domain");
		String dname=sc.next();
		EnquiryBean eb=new EnquiryBean(eid,fname,lname,cnum,locname,dname);
		
		conSer=new ContactBookServiceImpl();
		if(conSer.isValidEnquiry(eb))
		{
		int eid1=conSer.addEnquiry(eb);
		System.out.println("Dear "+eb.getfName()+" "+eb.getlName()+" and the unique id " +eid1+" added");
		}
		else
		{
			int eid1=conSer.addEnquiry(eb);
			System.out.println(eb);
			
		}
		
	}
}
