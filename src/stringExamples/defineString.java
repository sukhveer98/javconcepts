package stringExamples;

public class defineString {
	static int x =10;
	public static void main(String[] args) {
	String str1 = "Welcome";
	String str2 = new String("to home");
	str1 = str1+str2;
	System.out.println(str1);
	System.out.println(++x);
	Object o = x;
	System.out.println(o);
	}
}
