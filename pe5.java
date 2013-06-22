package euler;

public class pe5 {
	
	/*2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

	What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?*/
	
	public static void main(String[] args) {
		System.out.println(getAnswer());
	}
	
	public static int getAnswer() {
		int i = 20;											//20 is a goot starting place
		while (true) {
			if (isDivisible(i)) {							//Check to see if i is divisible by 1 through 20
				break;										//If it is, we're done
			} else {
				i++;										//If it isn't, then i++
			}
		}
		return i;
	}
	
	public static boolean isDivisible(int n) {
		for (int i = 2; i <= 20; i++) {						//Check to see if n is divisible by all numbers from 2 to 20 (everything is divisible by 1)
			if ( ! (n % i == 0) ) {
				return false;
			}
		}
		
		return true;
	}
	
}
