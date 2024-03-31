package methodoverriding;

public class MainDemo {
	public static void main(String [] args) {
		Rbi rbi;
		
		rbi = new Sbi();
		System.out.println(rbi.getRateOfInterest());
		System.out.println(rbi.getClass());
		System.out.println(rbi.hashCode());
		
		rbi = new Hdfc();
		System.out.println(rbi.getRateOfInterest());


	}
}
