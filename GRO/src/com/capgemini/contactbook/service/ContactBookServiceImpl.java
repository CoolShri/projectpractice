package com.capgemini.contactbook.service;

import com.capgemini.contactbook.dao.ContactBookDao;
import com.capgemini.contactbook.dao.ContactBookDaoImpl;
import com.capgemini.contactbook.dao.ContactBookException;
import com.igate.contactbook.bean.EnquiryBean;

public class ContactBookServiceImpl implements ContactBookService {
	
	ContactBookDaoImpl  conDao=new ContactBookDaoImpl();
public int addEnquiry(EnquiryBean enqry) throws ContactBookException
{
	
	return conDao.addEnquiry(enqry);
	
}
public  EnquiryBean getEnquiryDetails(int EnquiryID) throws ContactBookException
{
	return conDao.getEnquiryDetails(EnquiryID);
}
public boolean isValidEnquiry(EnquiryBean enqry) throws ContactBookException
{
	return false;
	
}
public boolean validateConatctNo(String fName)
{
	return false;
	
}
public boolean validateFirstName(String fName)
{
	return false;
	
}
public boolean validateLastName(String lName)
{
	return false;
	
}

public boolean valiadtePLocation(String pLocation)
{
	return false;
	
}

public boolean validatePDomain(String pDomain)
{
	return false;
	
}
}
