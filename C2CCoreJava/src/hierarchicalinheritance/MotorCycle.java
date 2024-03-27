package hierarchicalinheritance;

public class MotorCycle extends Vehicle{
		protected int speed;
		protected String motorCycleName;
		
		public MotorCycle(String brand, String color, int speed, String motorCycleName) {
			super(brand, color);
			// TODO Auto-generated constructor stub
			this.speed=speed;
			this.motorCycleName=motorCycleName;
			
		}

		public int getSpeed() {
			return speed;
		}

		public void setSpeed(int speed) {
			this.speed = speed;
		}

		public String getMotorCycleName() {
			return motorCycleName;
		}

		public void setMotorCycleName(String motorCycleName) {
			this.motorCycleName = motorCycleName;
		}

		@Override
		public String toString() {
			return "MotorCycle [getBrand()=" + getBrand()+ " ,getColor()=" + getColor() + "speed=" + speed + ", motorCycleName=" + motorCycleName  + "]";
			
			
		}
		
		
		
		
		
		


}
