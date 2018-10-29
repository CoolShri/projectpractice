package com.capgemini.gro.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.igate.contactbook.bean.EnquiryBean;

public class EnquiryUtil {

	
	static HashMap<Integer, EnquiryBean> hmap=new HashMap<>();
	
	public static int addEnqury(EnquiryBean enqry)
	{
	hmap.put(enqry.getEnqryid(),enqry);
	return enqry.getEnqryid();
	}
	
	public static EnquiryBean getEnquiryDetails(int enquiryID)
	{
	if(hmap.containsKey(enquiryID))
			{
		return  hmap.get(enquiryID);
			}
	return null;
		
	}
	
}
