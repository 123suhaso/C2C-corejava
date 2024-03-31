package overridingassignment;

public class TicketBooking {
	private String stageEvent;
	private String customer;
	private int noOfSeats;
	
	
	public TicketBooking(String stageEvent, String customer, int noOfSeats) {
		this.stageEvent = stageEvent;
		this.customer = customer;
		this.noOfSeats = noOfSeats;
	}
	
	public String getStageEvent() {
		return stageEvent;
	}
	public void setStageEvent(String stageEvent) {
		this.stageEvent = stageEvent;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	
	public void makePayment(Double amount) {
        System.out.println("This method is for cash payment.");
        System.out.println("Transaction detail: $" + amount + " paid in cash.");
    }

    public void makePayment(String walletNumber, Double amount) {
        System.out.println("This method is for wallet payment.");
        System.out.println("Transaction detail: $" + amount + " paid using wallet number " + walletNumber + ".");
    }

    public void makePayment(String creditCard, String ccv, String name, Double amount) {
        System.out.println("This method is for credit card payment.");
        System.out.println("Transaction detail: $" + amount + " paid using credit card number " + creditCard + ".");
    }

}
