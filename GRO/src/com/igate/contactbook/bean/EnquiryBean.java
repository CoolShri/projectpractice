package com.igate.contactbook.bean;

public class EnquiryBean {

	public EnquiryBean(int enqryid, String fName, String lname,
			String contactNo, String pLocation, String pDomain) {
		super();
		this.enqryid = enqryid;
		this.fName = fName;
		this.lname = lname;
		this.contactNo = contactNo;
		this.pLocation = pLocation;
		this.pDomain = pDomain;
	}
	public EnquiryBean() {
		super();
	}
	private int enqryid;
	private String fName;
	private String lname;
	private String contactNo;
	private String pLocation;
	private String pDomain;
	public int getEnqryid() {
		return enqryid;
	}
	public void setEnqryid(int enqryid) {
		this.enqryid = enqryid;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	@Override
	public String toString() {
		return "[enqryid=" + enqryid + ", fName=" + fName
				+ ", iname=" + lname + ", contactNo=" + contactNo
				+ ", pLocation=" + pLocation + ", pDomain=" + pDomain + "]";
	}
	public String getIname() {
		return lname;
	}
	public void setIname(String iname) {
		this.lname = iname;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getpLocation() {
		return pLocation;
	}
	public void setpLocation(String pLocation) {
		this.pLocation = pLocation;
	}
	public String getpDomain() {
		return pDomain;
	}
	public void setpDomain(String pDomain) {
		this.pDomain = pDomain;
	}
}
