package euler;

public class pe2 {
	
	/*Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

		1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

		By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.*/
	
	public static void main(String[] args) {
		System.out.println(getAnswer());
	}
	
	public static int getAnswer() {
		int sum = 0;							//Sum starts at 0
		int fibA = 1;
		int fibB = 2;
		
		while (fibA < 4000000) {				//For fib numbers less than 4 million
			if (fibA % 2 == 0) {				//If fib number is even, sum += it
				sum += fibA;
			}
			
			int temp = fibA;
			fibA = fibB;
			fibB += temp;
		}
		
		return sum;
	}
	
}
