package assignment1;

public class GetDetailsAssignment1 {
	protected String studentname;
	protected String studentRollNo;
	protected char studentGrade;
	protected double studentPercentage;
	
	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getStudentRollNo() {
		return studentRollNo;
	}
	
	public void setStudentRollNo(String studentRollNo) {
		this.studentRollNo = studentRollNo;
	}

	public char getStudentGrade() {
		return studentGrade;
	}

	public void setStudentGrade(char studentGrade) {
		this.studentGrade = studentGrade;
	}

	public double getStudentPercentage() {
		return studentPercentage;
	}

	public void setStudentPercentage(double studentPercentage) {
		this.studentPercentage = studentPercentage;
	}
    
	public String toString() {
		return "GetDetailsAssignment1 [studentname=" + studentname + ", studentRollNo=" + studentRollNo
				+ ", studentGrade=" + studentGrade + ", studentPercentage=" + studentPercentage + "]";
	}

	public static void main(String args[]) {
		GetDetailsAssignment1 s1 = new GetDetailsAssignment1();
		
		s1.setStudentname("suhas o");
		s1.setStudentRollNo("1EW20CS137");
		s1.setStudentGrade('A');
		s1.setStudentPercentage(86.9);
		System.out.print(s1);
		
	}

}
