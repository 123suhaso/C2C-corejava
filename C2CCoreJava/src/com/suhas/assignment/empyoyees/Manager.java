package com.suhas.assignment.empyoyees;

public class Manager {
	private String managerName;
	private String managerUid;
	private int managerPhoneNo;
	private String managerEmail;
	
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getManagerUid() {
		return managerUid;
	}
	public void setManagerUid(String managerUid) {
		this.managerUid = managerUid;
	}
	public int getManagerPhoneNo() {
		return managerPhoneNo;
	}
	public void setManagerPhoneNo(int managerPhoneNo) {
		this.managerPhoneNo = managerPhoneNo;
	}
	public String getManagerEmail() {
		return managerEmail;
	}
	public void setManagerEmail(String managerEmail) {
		this.managerEmail = managerEmail;
	}
	
	public void display() {
		System.out.print(managerName+ " " +managerUid+ " " +managerPhoneNo+ " " +managerEmail);
	}
	public String toString() {
		return "Manager [managerName=" + managerName + ", managerUid=" + managerUid + ", managerPhoneNo="
				+ managerPhoneNo + ", managerEmail=" + managerEmail + ", getManagerName()=" + getManagerName()
				+ ", getManagerUid()=" + getManagerUid() + ", getManagerPhoneNo()=" + getManagerPhoneNo()
				+ ", getManagerEmail()=" + getManagerEmail() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
