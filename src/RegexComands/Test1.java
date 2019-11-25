package RegexComands;

import java.util.regex.Pattern;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "test12the 34pattern##";
		String dilimiter1 = "\\d";
		String dilimiter2 = "[^a-zA-Z\\s]";
		Pattern pattern = Pattern.compile(dilimiter1,Pattern.CASE_INSENSITIVE);
		String[] results = pattern.split(s);
		for(String i : results) {
			System.out.println("string is: "+i);
		}
		pattern = Pattern.compile(dilimiter2,Pattern.CASE_INSENSITIVE);
		results = pattern.split(s);
		for(String i : results) {
			System.out.println("string with dlimiter2 is: "+i);
		}
	}

}
