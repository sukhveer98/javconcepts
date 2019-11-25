package inheritence;

public class practise {
	
	public static void main(String[] args) {
		int[] input = {2,-5,8,-3,4,10};
		int size = input.length;
		practise p = new practise();
		System.out.println("negative numbers are : "+ p.segregate(input, size) );
		
		
	}
	public int segregate(int[] A, int size) {
		int j =0, i;
		for(i=0;i<size;i++) {
			if(A[i]<0) {
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}
			j++;
			
		}
		return j;
	}

}



