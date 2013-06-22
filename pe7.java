package euler;

import java.util.HashSet;

public class pe7 {
	
	/*By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

	What is the 10 001st prime number?*/
	
	public static void main(String[] args) {
		System.out.println(getAnswer());
	}
	
	private static HashSet<Integer> primes = new HashSet<Integer>();			//Create HashSet primes to remember all the primes we've found
	
	public static int getAnswer() {
		primes.add(2);															//Add 2 and 3 to primes
		primes.add(3);
		int currentPrime = 3;													//currentPrime is the most recently found prime
		
		for (int k = 1; primes.size() < 10001; k++) {							//Generate prime numbers until we have 10,001 of them
			int slug = 6 * k;													//Every prime can be expressed as 6k +or- 1
			int lessOne = slug - 1;
			int plusOne = slug + 1;
			
			if (isPrime(lessOne)) {												//See if 6k-1 is prime
				primes.add(lessOne);
				currentPrime = lessOne;
			}
			
			if (isPrime(plusOne)) {												//See if 6k+1 is prime
				primes.add(plusOne);
				currentPrime = plusOne;
			}
		}
		
		return currentPrime;
	}
	
	private static boolean isPrime(int n) {
		for (int prime : primes) {												//Test to see if n is divisible by any of the primes we've found
			if (n % prime == 0) {												//If it is, it isn't prime
				return false;													//Otherwise, it is!
			}
		}
		
		return true;
	}
}
