import java.util.Scanner;

public class NestedIfStatement {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value a:");
		int a = sc.nextInt();
		System.out.println("Enter the value b:");
		int b = sc.nextInt();
		System.out.println("Enter the value c:");
		int c = sc.nextInt();
		if(a>b && a>c)
			System.out.println("a is grater than b and c:");
		else if(b>c && b>a)
			System.out.println("b is grater than c and a");
		else
		System.out.println("c is grater than b and a");
		
          //or
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the value x:");
		int x = sc1.nextInt();
		System.out.println("Enter the value y:");
		int y = sc1.nextInt();
		System.out.println("Enter the value z:");
		int z = sc1.nextInt();
		if(x>y) {
			if(x>z) {
				System.out.println("x is grater");
			}else {
				System.out.println("z is grater");

			}
		}else {
			if(y>z) {
				System.out.println("y is grater");
			}else {
				System.out.println("z is grater");

			}
		}

			
		
	}

}
