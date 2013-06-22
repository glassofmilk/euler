package euler;


public class pe10 {
	
	/*The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

	Find the sum of all the primes below two million.*/
	
	public static void main(String[] args) {
		System.out.println(getAnswer());
	}
	
	public static boolean[] sieve = new boolean[2000000];			//Initialize a sieve of Erastothenes (sp?)
	
	public static long getAnswer() {
		long sum = 0;												//Sum starts at 0
		for (int i = 0; i < sieve.length; i++) {					//Pack sieve with true
			sieve[i] = true;
		}
		sieve[0] = false;											//0 and 1 aren't primes
		sieve[1] = false;
		
		for (int i = 0; i < sieve.length; i++) {					//Every true value is a prime
			if (sieve[i]) {
				foundPrime(i);
				sum += i;
			}
		}
		
		return sum;
	}
	
	public static void foundPrime(int n) {							//Removes all multiples of a prime number from sieve
		for (int i = n * 2; i < sieve.length; i += n) {
			sieve[i] = false;
		}
	}
}
