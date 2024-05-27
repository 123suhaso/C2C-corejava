import java.util.*;

public class Demo {
	public static void main(String args[])
	{
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
//		for(int i=0;i<5;i++) {
//			int  k = sc.nextInt();
//			a[i]=k;
//		}
//		System.out.println("Array conatins");
//		for(int i=0;i<a.length;i++)
//			System.out.println(a[i]);
		String m = sc.next();
		for(int i=0;i<m.length();i++)
			System.out.println(m.charAt(i));
				}
}
