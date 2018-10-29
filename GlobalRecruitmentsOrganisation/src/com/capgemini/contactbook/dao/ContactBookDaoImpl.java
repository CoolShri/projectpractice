package com.capgemini.contactbook.dao;

import java.util.Iterator;
import java.util.Map;

import com.capgemini.contactbook.exception.ContactBookException;
import com.capgemini.contactbook.util.DBUtil;
import com.igate.contactbook.bean.EnquiryBean;

public class ContactBookDaoImpl implements ContactBookDao{
	
	@Override
	public int addEnquiry(EnquiryBean enqry) throws ContactBookException {
		DBUtil.addEnquiry(enqry);
		return enqry.getEnqryId();
	}

	@Override
	public EnquiryBean getEnquiryDetails(int EnquiryID) throws ContactBookException {
		
		return DBUtil.getAllDetails(EnquiryID);
	
	}
}
