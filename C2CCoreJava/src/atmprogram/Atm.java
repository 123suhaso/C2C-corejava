package atmprogram;
import java.util.Scanner;

public class Atm {
	public int amount=1000;
	public int amount_deposit;
	public int amount_withdrawal;

    public void amount() {
    	Scanner sc = new Scanner(System.in);
    	int n = -1;
    	do {
    		System.out.println("----WELLCOME TO ATM----");
    		System.out.println("1. deposit");
     		System.out.println("2. withdrawal");
     		System.out.println("3. balance");
     		System.out.println("0. Exit");
     		System.out.println("-----------------------");
     		System.out.print("Enter Your Choice:");
     		n = sc.nextInt();

     		switch(n) 
     		{
     		   case 1:
     				  System.out.println("Enter The Amount");
    				  amount_deposit = sc.nextInt();
    	 			  if(amount_deposit >0 && amount_deposit<=1000) {
    	 				  amount = amount - amount_deposit;
    	 			      System.out.println("Your Amount is deposit successfully");
    	 			  }else {
     				  System.out.println("Sorry your amount is exceeded maximum limit");

     			  }
     			   
     			   break;
     		   case 2:
     				  System.out.println("Enter The Amount");
     	 			  amount_withdrawal = sc.nextInt();
     				  amount = amount + amount_withdrawal;
     			      System.out.println("Your Amount is withdrawal successfully");
    			  break;
     		   case 3:
     			  System.out.println(amount);
    			  System.out.println("Your account balance feached successfully");

                  break;
     		   case 0:
     			   System.out.println("Thanks For Visiting An Atm ");
     			   break;
               
     		   default :
     			   System.out.print("Invalid Input");
     			   
     			
     		}
 		
    	}while(n!=0);
 		
 	}
    	


	public static void main(String[] args) {
		Atm atm = new Atm();
		atm.amount();
	}

}

