package euler;

public class pe9 {
	
	/*A Pythagorean triplet is a set of three natural numbers, a  b  c, for which,

	a^2 + b^2 = c^2
	For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

	There exists exactly one Pythagorean triplet for which a + b + c = 1000.
	Find the product abc.*/
	
	public static void main(String[] args) {
		System.out.println(getAnswer());
	}
	
	/*This part is going to take some algebra
	 * We know that a^2 + b^2 == c^2 and a + b + c == 1000
	 * Therefore c == 1000 - (a + b)
	 * a^2 + b^2 == (1000 - (a + b))^2
	 * a^2 + b^2 == 1000000 - 2000 * (a + b) + (a + b)^2
	 * a^2 + b^2 == 1000000 - 2000 * (a + b) + a^2 + 2 * a * b + b^2
	 * 0 == 1000000 - 2000 * (a + b) + 2 * a * b
	 * 2000 * (a + b) - 2 * a * b == 1000000 
	 * 1000 * (a + b) - a * b == 500000 
	 * a * (1000 - b) + 1000 * b == 500000 
	 * a * (1000 - b) == 500000 - 1000 * b
	 * a == (500000  - 1000 * b) / (1000 - b)
	 * 
	 *  And there we go. It's so simple!  */
	
	public static int getAnswer() {
		int product = 0;										//Initialize product as 0
		double bd = 1.0;										//b starts at 1
		
		while (product == 0) {									//If b is part of a pythagorean triplet that fits a + b + c == 1000
			double ad = (500000-1000*bd)/(1000-bd);				//Then product is set to be equal to it
			if (ad == (int)ad) {								//Otherwise, increment b and check again
				int a = (int)ad;
				int b = (int)bd;
				int c = 1000 - a - b;
				product = a * b * c;
			}
			bd++;
		}
		
		return product;
	}
	
}
