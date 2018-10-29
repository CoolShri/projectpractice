package com.capgemini.contactbook.util;

import java.util.HashMap;
import java.util.Map;

import com.igate.contactbook.bean.EnquiryBean;

public class DBUtil 
{
	static int count=0;
	static Map<Integer,EnquiryBean> map1=new HashMap<>();
	public static void addEnquiry(EnquiryBean enqry)
	{
	
		map1.put(enqry.getEnqryId(),enqry);
	
	}
	public static EnquiryBean getAllDetails(int enquiryID)
	{
		if(map1.containsKey(enquiryID))
		
			{
			return map1.get(enquiryID);
			}
		return null;
				
	}
}
