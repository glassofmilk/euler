package euler;

public class pe6 {
	
	/*The sum of the squares of the first ten natural numbers is,

	1^2 + 2^2 + ... + 10^2 = 385
	The square of the sum of the first ten natural numbers is,

	(1 + 2 + ... + 10)^2 = 552 = 3025
	Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 - 385 = 2640.

	Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.*/
	
	public static void main(String[] args) {
		System.out.println(getAnswer());
	}
	
	public static int getAnswer() {
		int difference = Math.abs(getSumOfSquares() - getSquareOfSums());			//Returns difference of sumOfSquares and squareOfSums of first 100 natural numbers
		return difference;
	}
	
	public static int getSumOfSquares() {
		int sum = 0;							//Sum starts at 0
		for (int i = 1; i <= 100; i++) {
			sum += i * i;						//Sum += square of every number from 1 to 100
		}
		return sum;								//Return sum
	}
	
	public static int getSquareOfSums() {
		int sum = 0;							//Sum starts at 0
		for (int i = 1; i <= 100; i++) {
			sum += i;							//Sum += every number from 1 to 100
		}
		return sum * sum;						//Return square of sum
	}
	
}
