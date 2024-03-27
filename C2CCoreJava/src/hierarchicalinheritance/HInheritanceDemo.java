package hierarchicalinheritance;

public class HInheritanceDemo {
	public static void main(String args[]) {
		Car c1=new Car(2,4,4,"BMW","red");
		System.out.println(c1);
		MotorCycle mc1 = new MotorCycle("BMW","pink",180,"BMW");
		System.out.println(mc1);
	}

}
