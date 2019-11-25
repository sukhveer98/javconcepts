package Programs;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("number is prime: "+ findPrime(1));
		

	}
	public static boolean findPrime(int n) {
		if(n <= 1)
			return false;
		if(n%2 ==0)
			return false;
		for(int i = 2; i < n/2; i++)
		{
			if(n%2 ==0)
				return false;
		}
			return true;
		
	}

}
