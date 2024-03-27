package day4inheritance;

public class Student extends Citizen{
		private int rollNo;
		private String collegeName;
		
		
		
		
		
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Student(String name, long aadharNo, String address, long phoneNo ,int rollNo ,String collegeName) {
			super(name, aadharNo, address, phoneNo);
			// TODO Auto-generated constructor stub
			this.rollNo = rollNo;
			this.collegeName = collegeName;
		}
		public int getRollNo() {
			return rollNo;
		}
		public void setRollNo(int rollNo) {
			this.rollNo = rollNo;
		}
		public String getCollegeName() {
			return collegeName;
		}
		public void setCollegeName(String collegeName) {
			this.collegeName = collegeName;
		}
		@Override
		public String toString() {
			return "Student [getName()=" + getName()+ ", getAadharNo()=" + getAadharNo() + ", getAddress()=" + getAddress() + ", getPhoneNo()="
					+ getPhoneNo() +" rollNo=" + rollNo + ", collegeName=" + collegeName +  "]";
			
			
		}
		

	}



