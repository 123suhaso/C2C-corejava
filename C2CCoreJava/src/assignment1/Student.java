package assignment1;
import java.util.Scanner;

public class Student {
	private String sName;
	private String sAddress;
	private double sPhoneNo;
	private double sSaleAmount;
	private double commission;
	public void getStusentInput() {
		Scanner student = new Scanner(System.in);
		System.out.println("Enter an Student sName:");
		sName = student.next();
		System.out.println("Enter an Student sAddress:");
	    sAddress = student.next();
		System.out.println("Enter an Student sPhoneNo:");
		sPhoneNo = student.nextDouble();
		System.out.println("Enter an Student sSaleAmount:");
		sSaleAmount = student.nextDouble();
	}
	    public Student() {
	        System.out.println("Student object is created");
	    }
	
	public void sSaleAmountCommission() {
		if(sSaleAmount >= 100000) {
			commission = sSaleAmount*0.10;
		}
		else if(sSaleAmount>=50000 && sSaleAmount < 100000) {
			commission = sSaleAmount*0.05;
		}
		else if(sSaleAmount>=30000 && sSaleAmount < 50000) {
			commission = sSaleAmount*0.03;
		}
		else {
             commission = 0;
		}
		if(commission == 0)
			System.out.println("name ="+sName +" "+"commision= No commision");
		else
			System.out.println("name ="+sName +" "+"commision= "+" "+ commission);
	}
	public static void main(String args[]) {
		Student sc  = new Student();
		sc.getStusentInput();
		sc.sSaleAmountCommission();
		
	}
	
		
}


