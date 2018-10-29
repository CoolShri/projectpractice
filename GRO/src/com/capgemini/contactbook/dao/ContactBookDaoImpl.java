package com.capgemini.contactbook.dao;

import com.capgemini.gro.util.EnquiryUtil;
import com.igate.contactbook.bean.EnquiryBean;

public class ContactBookDaoImpl implements ContactBookDao {

	@Override
	public int addEnquiry(EnquiryBean enqry) throws ContactBookException {

		EnquiryUtil.addEnqury(enqry);
		return enqry.getEnqryid();
	}

	@Override
	public EnquiryBean getEnquiryDetails(int EnquiryID)	throws ContactBookException
	{
	
		
		return EnquiryUtil.getEnquiryDetails(EnquiryID);
		
	}

}
