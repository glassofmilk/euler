package euler;

public class pe3 {
	
	/*The prime factors of 13195 are 5, 7, 13 and 29.

	What is the largest prime factor of the number 600851475143 ?*/
	
	public static void main(String[] args) {
		System.out.println(getAnswer());
	}
	
	public static boolean[] sieve;
	
	public static int getAnswer() {
		int largestFactor = 0;										//largestFactor starts at 0
		sieve = new boolean[(int)Math.sqrt(600851475143L) + 1];		//Primes sieve of boolean values up to sqrt of target
		for (int i = 0; i < sieve.length; i++) {					//Fill sieve with true values
			sieve[i] = true;
		}
		sieve[0] = false;											//0 and 1 aren't prime
		sieve[1] = false;
		
		for (int i = 0; i < sieve.length; i++) {					//Find first true value. It will be a prime
			if (sieve[i]) {											//If it is a factor of target, it is new largest factor
				if (600851475143L % i == 0) {
					largestFactor = i;
				}
				foundPrime(i);										//Remove all multiples of found prime from sieve
			}
		}
		
		return largestFactor;
	}
	
	public static void foundPrime(int n) {							//Removes all multiples of a prime number from sieve
		for (int i = n * 2; i < sieve.length; i += n) {
			sieve[i] = false;
		}
	}
	
}
