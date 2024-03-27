package hierarchicalinheritance;

public class Vehicle {
	protected String brand;
	protected String color;
	 
	public Vehicle(String brand, String color) {
		super();
		this.brand = brand;
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	 
	 

}
