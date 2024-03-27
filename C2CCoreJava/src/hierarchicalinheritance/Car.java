package hierarchicalinheritance;

public class Car extends Vehicle{
	protected int numberOfDoors;
	protected int numberOfSeats;
	protected int numberOfWheel;
	
	public Car( int numberOfDoors, int numberOfSeats, int numberOfWheel,String brand, String color) {
		super(brand, color);
		this.numberOfDoors = numberOfDoors;
		this.numberOfSeats = numberOfSeats;
		this.numberOfWheel = numberOfWheel;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public int getNumberOfWheel() {
		return numberOfWheel;
	}

	public void setNumberOfWheel(int numberOfWheel) {
		this.numberOfWheel = numberOfWheel;
	}

	@Override
	public String toString() {
		return "Car [numberOfDoors=" + numberOfDoors + ", numberOfSeats=" + numberOfSeats + ", numberOfWheel="
				+ numberOfWheel + ", getBrand()=" + getBrand() + ", getColor()=" + getColor() + "]";
	}
	
	
	
	


}
