package stringtopics;

public class StringComparison {
	public static void main(String[] args) {
		String s1 = "suhas";//it will share the same memory
		
		String s2 = "suhas";//it will share the same memory
		
		String s3=new String("suhas");
		String s4=new String("suhas");
		
		System.out.println("s1 == s2 :"+ (s1==s2)+ " s1 equals s2 "+s1.equals(s2)) ;
		System.out.println("s3 == s4 :"+ (s3==s4)+ " s3 equals s4 "+s3.equals(s4)) ;

	
		
	}
	

}
