package stringtopics;

public class StringOperationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("  India  ");
		String s2 = s1.toUpperCase();//upper() method in string
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.length());//length() method in string
		System.out.println(s2.length());
		
		System.out.println(s1.substring(2,7));//substring() method in string
		System.out.println(s2.trim());
	
	}

}
