package polymorphism;

public class MethodOverLoading {
	
	public static int addition(int a,int b) {
		return a + b;
	}
	public static float addition(int a,float b) {
		return a + b;
	}
	public static float addition(float a,int b) {
		return a + b;
	}
	public static float addition(float a,float b) {
		return a + b;
	}

}
