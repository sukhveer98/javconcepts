package Programs;

public class FindFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Fibonacci of number is :"+fibo(9));
    for(int i =0; i<=6; i++) {
    System.out.println("Fibonacci of number is :"+fibo1(6));
    System.out.println("all numbers are "+ fibo1(i));
    }
	}
 public static int fibo(int n) {
	 if(n <=1)
		 return n;
	 return fibo(n-1)+ fibo(n-2);
 }
 public static int fibo1(int n) {
	 int f[] =  new int[n+2];
	 f[0]=1;
	 f[1]=1;
	 int i;
	 for(i=2; i<=n; i++) {
		 f[i] = f[i-1]+ f[i-2];
	 }
	 return f[n]; 
}
}
