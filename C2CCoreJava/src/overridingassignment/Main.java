package overridingassignment;
import java.util.Scanner;

public class Main {
	
	  public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter transaction details in CSV format (Stage event,Customer, seat no,walletNumber, amount): ");
	    String userInput = scanner.nextLine();

	    String[] transactionDetails = userInput.split(",");

	    if (transactionDetails.length != 5) {
	      System.out.println("Invalid input format. Please enter details in CSV format.");
	      return;
	    }

	    String stageEvent = transactionDetails[0].trim();
	    String Customer = transactionDetails[1].trim();
	    String seatNo = transactionDetails[2].trim();
	    String walletNumber = transactionDetails[3].trim();

	    double amount = Double.parseDouble(transactionDetails[4].trim());

       
	
	    System.out.println("Enter your choice (1 - Cash, 2 - Credit Card, 3 - Wallet): ");
	    int choice = scanner.nextInt();

	    switch (choice) {
	      case 1:
	    	  System.out.println("Cash payment selected.");
	        break;
	      case 2:
	        System.out.println("Credit card payment selected.");
	        break;
	      case 3:
	        System.out.println("Wallet payment selected.");
	        break;
	      default:
	        System.out.println("Invalid choice.");
	        return;
	    }
	    
	    TicketBooking paymentProcessor = null;
        String showName = null;
	    TicketBooking paymentProcessor1 = new TicketBooking(showName, showName, choice); 
	    TicketBooking paymentProcessor2 = new TicketBooking(showName, showName, choice);
	    TicketBooking paymentProcessor3 = new TicketBooking(showName, showName, choice);


	    if (choice == 1) {
	 
		      paymentProcessor1.makePayment(amount);
		      System.out.println("Ticket booked successfully for " + stageEvent);
			  System.out.println("Show Name: " + Customer);
			  System.out.println("Seat No: " + seatNo);
			  System.out.println("Show Name: " + stageEvent);
			  System.out.println("Amount : $" + amount+ " paid in cash");

	    	  
	      
	    } else if (choice == 2) {
			  paymentProcessor2.makePayment(walletNumber,amount);
		      System.out.println("Ticket booked successfully for " + stageEvent);
			  System.out.println("Show Name: " + Customer);
			  System.out.println("Seat No: " + seatNo);
			  System.out.println("Show Name: " + stageEvent);
			  System.out.println("Amount : $" + amount+ " paid using wallet");
	    } else if (choice == 3) {
	    	String creditCard = null;
			String ccv = null;
			String name = null;
			paymentProcessor3.makePayment(creditCard,ccv,name,amount);
		      System.out.println("Ticket booked successfully for " + stageEvent);
			  System.out.println("Show Name: " + Customer);
			  System.out.println("Seat No: " + seatNo);
			  System.out.println("Show Name: " + stageEvent);
			  System.out.println("Holder Name: " + Customer);
			  System.out.println("Amount : $" + amount+ " paid using master card");
	    	
	    }

	    
	  }
	

}
