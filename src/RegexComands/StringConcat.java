package RegexComands;

public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		String s1 = "test";
		StringBuilder sb = new StringBuilder(s1);
		sb.append("concat");
		System.out.println(sb);
		System.out.println(s1.matches("^[a-z]*$"));

	}

}
