package com.suhas.assignment.empyoyees;

public class Employees {
	private String employeeName;
	private String employeeUid;
	private float employeeSalary;
	private float employeeAge;
	private int employeePhoneNo;
	private String employeeEmail;
	
	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeUid() {
		return employeeUid;
	}

	public void setEmployeeUid(String employeeUid) {
		this.employeeUid = employeeUid;
	}

	public float getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(float employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public float getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(float employeeAge) {
		this.employeeAge = employeeAge;
	}

	public int getEmployeePhoneNo() {
		return employeePhoneNo;
	}

	public void setEmployeePhoneNo(int employeePhoneNo) {
		this.employeePhoneNo = employeePhoneNo;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	
	public void display() {
		System.out.print(employeeName+ " " +employeeUid+ " " +employeeSalary+ " " +employeeAge+ " " +employeePhoneNo+ " " +employeeEmail );
	}

	public String toString() {
		return "Employees [employeeName=" + employeeName + ", employeeUid=" + employeeUid + ", employeeSalary="
				+ employeeSalary + ", employeeAge=" + employeeAge + ", employeePhoneNo=" + employeePhoneNo
				+ ", employeeEmail=" + employeeEmail + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
	
	

}
