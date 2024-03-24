package com.suhas.assignment.empyoyees;

public class Developer {
	private String developerName;
	private String developerUid;
	private int developerPhoneNo;
	private String developerEmail;
	public String getDeveloperName() {
		return developerName;
	}
	public void setDeveloperName(String developerName) {
		this.developerName = developerName;
	}
	public String getDeveloperUid() {
		return developerUid;
	}
	public void setDeveloperUid(String developerUid) {
		this.developerUid = developerUid;
	}
	public int getDeveloperPhoneNo() {
		return developerPhoneNo;
	}
	public void setDeveloperPhoneNo(int developerPhoneNo) {
		this.developerPhoneNo = developerPhoneNo;
	}
	public String getDeveloperEmail() {
		return developerEmail;
	}
	public void setDeveloperEmail(String developerEmail) {
		this.developerEmail = developerEmail;
	}
	
	public void display() {
		System.out.print(developerName+ " " +developerUid+ " " +developerPhoneNo+ " " +developerEmail);
	}
	public String toString() {
		return "Developer [developerName=" + developerName + ", developerUid=" + developerUid + ", developerPhoneNo="
				+ developerPhoneNo + ", developerEmail=" + developerEmail + ", getDeveloperName()=" + getDeveloperName()
				+ ", getDeveloperUid()=" + getDeveloperUid() + ", getDeveloperPhoneNo()=" + getDeveloperPhoneNo()
				+ ", getDeveloperEmail()=" + getDeveloperEmail() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
