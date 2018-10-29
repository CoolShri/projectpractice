package com.capgemini.contactbook.ui;

import java.util.Random;
import java.util.Scanner;

import com.capgemini.contactbook.dao.ContactBookException;
import com.capgemini.contactbook.service.ContactBookServiceImpl;
import com.igate.contactbook.bean.EnquiryBean;

public class client {
	static Scanner sc=new Scanner(System.in);
	static ContactBookServiceImpl conSer=new ContactBookServiceImpl();
	public static void main(String[] args) throws ContactBookException {

		while(true)
		{
		System.out.println("Choose an operation");
		System.out.println("1.enter Enquiry Details");
		System.out.println("2.view enquiry details");
		System.out.println("0.exit");
		System.out.println("------------------------------");
		System.out.println("Please enter a choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:addEnquiry();
		break;
		case 2:getEnquiryDetails();
		break;
		
		default :System.exit(0);
		}
		
		}

	}

	private static void getEnquiryDetails() throws ContactBookException {
		try
		{
		System.out.println("enter query id");
		int qid=sc.nextInt();
		EnquiryBean k=conSer.getEnquiryDetails(qid);
		if(k!=null)
		System.out.println(k.toString());
		else
		{
			throw new ContactBookException("Sorry no detals found!!");
		}
	}
		catch(Exception e)
		{
		System.out.println(e.getMessage());	
		}
		
		}

	private static void addEnquiry() throws ContactBookException {
		Random r=new Random();
		System.out.println("Enter First Name");
		String fname=sc.next();
		System.out.println("Enter Last Name");
		String lname=sc.next();
		System.out.println("Enter contact Nnmber");
		String contactNo=sc.next();
		System.out.println("Enter Prefered Domain ");
		 String pDomain=sc.next();
		System.out.println("Enter Preferred Location");
		String pLocation=sc.next();
		
		EnquiryBean EnqBean= new EnquiryBean(Math.abs(r.nextInt(10000)),fname,lname,contactNo,pDomain,pLocation);
		
		conSer.addEnquiry(EnqBean);
		System.out.println("Thank you  "+EnqBean.getfName()+" "+EnqBean.getIname()+"  your Unique id is  "+EnqBean.getEnqryid()+"  we will conatct you shortly  ");
	
	}

}
