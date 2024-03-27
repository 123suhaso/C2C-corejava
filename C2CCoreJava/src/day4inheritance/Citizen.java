package day4inheritance;

public class Citizen {
	private String name;
	private long aadharNo;
	private String address;
	private long phoneNo;
	
	public Citizen() {
		
	}
	public Citizen(String name, long aadharNo, String address, long phoneNo) {
		this.name = name;
		this.aadharNo = aadharNo;
		this.address = address;
		this.phoneNo = phoneNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", aadharNo=" + aadharNo + ", address=" + address + ", phoneNo=" + phoneNo
				+ "]";
	}
	

}
