package assignment1;

import java.util.Scanner;

public class Circle {
	protected double radius;
    protected String color;
    
    public void getInput() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter The Radius of the circle");
    	radius = sc.nextDouble();
    	System.out.println("Enter The color of the circle");
    	color = sc.next();
    	
    	}
    public void calculateCircle() {
    	double result= 3.142*radius*radius;
    	System.out.println("The area of the circle with radius " + radius + " and color " + color + " is: " + result);
    	
    }
    public static void main(String args[]) {
    	Circle cr = new Circle();
    	cr.getInput();
    	cr.calculateCircle();
    }

}

   
