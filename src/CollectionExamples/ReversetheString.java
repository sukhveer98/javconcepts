package CollectionExamples;

public class ReversetheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("reverse is: "+ reverse("this is just awesome"));

	}
	public static String reverse(String s) {
		String[] input = s.split(" ");
		StringBuilder builder =  new StringBuilder();
		for(int i = input.length-1;i>=0; i--) {
			builder.append(input[i]);
			builder.append(" ");
			
		}
		
		
		
		return builder.toString();
	}

}
