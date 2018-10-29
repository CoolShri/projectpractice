package com.igate.contactbook.bean;

public class EnquiryBean {
	private int enqryId;
	private String fName;
	private String lName;
	private String contactNo;
	public EnquiryBean(int enqryId, String fName, String lName, String contactNo, String pLocation, String pDomain) {
		super();
		this.enqryId = enqryId;
		this.fName = fName;
		this.lName = lName;
		this.contactNo = contactNo;
		this.pLocation = pLocation;
		this.pDomain = pDomain;
	}
	private String pLocation;
	private String pDomain;
	public int getEnqryId() {
		return enqryId;
	}
	public void setEnqryId(int enqryId) {
		this.enqryId = enqryId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
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
	@Override
	public String toString() {
		return "[enqryId=" + enqryId + ", fName=" + fName + ", lName=" + lName + ", contactNo=" + contactNo
				+ ", pLocation=" + pLocation + ", pDomain=" + pDomain + "]";
	}

}
