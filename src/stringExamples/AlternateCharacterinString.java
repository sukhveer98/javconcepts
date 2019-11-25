package stringExamples;

public class AlternateCharacterinString {
	
	public static String mixInputs(String s1, String s2) {
		StringBuffer buffer = new StringBuffer();
		for(int i =0; i<s1.length() || i<s2.length(); i++) {
			if(i<s1.length())
			 buffer.append(s1.charAt(i));
			if(i<s2.length())
				 buffer.append(s2.charAt(i));
			
		}
		
		return buffer.toString();
		
		
	}
	public static void main(String[] args) {
		System.out.println("output is :"+ mixInputs("ABCDEF", "12345"));
		
	}

}
