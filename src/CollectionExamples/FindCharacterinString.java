package CollectionExamples;

public class FindCharacterinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("occurance of t in testing is : "+ find("testing", 't'));
		System.out.println("occurance of t in testing is : "+ find1("testing", 't'));

	}
	//using streams
	public static long find(String s, char c) {
		long count  = 0;
		count = s.chars().filter(ch->ch==c).count();
		return count;
		
		
	}
	
	//using lambdas
	public static long find1(String s, char c) {
		long count  = 0;
		count = s.codePoints().filter(ch->ch==c).count();
		return count;
		
		
	}
	


}
