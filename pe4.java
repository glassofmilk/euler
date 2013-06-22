package euler;

public class pe4 {
	
	/*A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 99.

	Find the largest palindrome made from the product of two 3-digit numbers.*/
	
	public static void main(String[] args) {
		System.out.println(getAnswer());
	}
	
	public static int getAnswer() {
		int largestPalindrome = 0;												//largestPalindrome starts at 0
		
		for (int a = 100; a < 1000; a++) {										//Look at every product of two 3-digit numbers
			for (int b = a; b < 1000; b++) {
				int product = a * b;
				if (isPalindrome(product) && product > largestPalindrome) {		//If product is a palindrome and greater than current largestPalindrome
					largestPalindrome = product;								//then this is new largest palindrome
				}
			}
		}
		
		return largestPalindrome;
	}
	
	public static boolean isPalindrome(int n) {
		String original = "" + n;												//Convert n to string
		String reversed = "";													//Initialize reversed string
		
		for (int i = original.length() - 1; i >= 0; i--) {
			reversed += original.charAt(i);										//Reverse original string
		}
		
		if (original.equals(reversed)) {										//If original is same as reverse, return true, else return false
			return true;
		} else {
			return false;
		}
	}
}
