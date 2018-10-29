package com.capgemini.contactbook.service;

import java.util.Scanner;
import java.util.regex.Pattern;

import com.capgemini.contactbook.dao.ContactBookDao;
import com.capgemini.contactbook.dao.ContactBookDaoImpl;
import com.capgemini.contactbook.exception.ContactBookException;
import com.igate.contactbook.bean.EnquiryBean;

public class ContactBookServiceImpl implements ContactBookService{
static ContactBookDao cbd=new ContactBookDaoImpl();

	@Override
	public int addEnquiry(EnquiryBean enqry) throws ContactBookException {
	
		return cbd.addEnquiry(enqry);
		
	}

	@Override
	public EnquiryBean getEnquiryDetails(int EnquiryID) throws ContactBookException {
		return cbd.getEnquiryDetails(EnquiryID);
	}

	@Override
	public boolean isValidEnquiry(EnquiryBean enqry) throws ContactBookException {
	while(true)
	{
	if(validateFirstName(enqry.getfName()))
	{
		if(validateLastName(enqry.getlName()))
		{
			if(validateLocation(enqry.getpLocation()))
			{
				if(validateContactNo(enqry.getContactNo()))
				{
					if(validateDomain(enqry.getpDomain()))
					{
						return true;
					}
					else
					{
						
					return false;	
					
					}
				}
				else
				{
					return false;
				}
			}
			else
			{
				return false;
			}
		}
		else
		{
			System.out.println("Inavlid name");
			System.out.println("enter name: ");
			Scanner sc2=new Scanner(System.in);
			String lanme1=sc2.next();
			enqry.setfName(lanme1);
			return false;
			
		}
	}
	else
	{
	System.out.println("Inavlid name");
	System.out.println("enter name: ");
	Scanner sc1=new Scanner(System.in);
	String fanme1=sc1.next();
	enqry.setfName(fanme1);
	return false;
	}
	}
	}
	@Override
	public boolean validateContactNo(String contactNo) throws ContactBookException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validateFirstName(String fname) throws ContactBookException {
		String fname1="[A-Z][a-z]+";
		if(Pattern.matches(fname1,fname))
		{
			return true;
		}
		
		
		return false;
	}

	@Override
	public boolean validateLastName(String lname) throws ContactBookException {
		String lname1="[A-Z][a-z]+";
		if(Pattern.matches(lname1,lname))
		{
			return true;
		}
		
		
		return false;
	}

	@Override
	public boolean validateLocation(String loc) throws ContactBookException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validateDomain(String domain) throws ContactBookException {
		// TODO Auto-generated method stub
		return false;
	}

	
}
