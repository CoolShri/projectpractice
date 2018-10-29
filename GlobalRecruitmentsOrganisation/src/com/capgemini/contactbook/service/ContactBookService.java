package com.capgemini.contactbook.service;

import com.capgemini.contactbook.exception.ContactBookException;
import com.igate.contactbook.bean.EnquiryBean;

public interface ContactBookService{
public int addEnquiry(EnquiryBean enqry) throws ContactBookException;
public EnquiryBean getEnquiryDetails(int EnquiryID) throws ContactBookException;
public boolean isValidEnquiry(EnquiryBean enqry) throws ContactBookException;
public boolean validateContactNo(String contactNo) throws ContactBookException;
public boolean validateFirstName(String fname) throws ContactBookException;
public boolean validateLastName(String lname) throws ContactBookException;
public boolean validateLocation(String loc) throws ContactBookException;
public boolean validateDomain(String domain) throws ContactBookException;
} 
