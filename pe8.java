package euler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class pe8 {
	
	/*Find the greatest product of five consecutive digits in the 1000-digit number.

	73167176531330624919225119674426574742355349194934
	96983520312774506326239578318016984801869478851843
	85861560789112949495459501737958331952853208805511
	12540698747158523863050715693290963295227443043557
	66896648950445244523161731856403098711121722383113
	62229893423380308135336276614282806444486645238749
	30358907296290491560440772390713810515859307960866
	70172427121883998797908792274921901699720888093776
	65727333001053367881220235421809751254540594752243
	52584907711670556013604839586446706324415722155397
	53697817977846174064955149290862569321978468622482
	83972241375657056057490261407972968652414535100474
	82166370484403199890008895243450658541227588666881
	16427171479924442928230863465674813919123162824586
	17866458359124566529476545682848912883142607690042
	24219022671055626321111109370544217506941658960408
	07198403850962455444362981230987879927244284909188
	84580156166097919133875499200524063689912560717606
	05886116467109405077541002256983155200055935729725
	71636269561882670428252483600823257530420752963450*/
	
	public static final String PATH_TO_FILE = "pe8.txt";          //Enter path to pe8.txt here. This is a text file that contains the number above with no whitespace, only newlines
	
	public static void main(String[] args) {
		System.out.println(getAnswer());
	}
	
	public static int getAnswer() {
		String numberString = getNumAsString();								//Get the number in that block as a string from a text file
		int greatestProduct = 0;											//greatestProduct starts at 0
		
		for (int i = 0; i + 4 < numberString.length(); i++) {				//Check every product of five consecutive numbers in the string
			int a = Character.getNumericValue(numberString.charAt(i));
			int b = Character.getNumericValue(numberString.charAt(i + 1));
			int c = Character.getNumericValue(numberString.charAt(i + 2));
			int d = Character.getNumericValue(numberString.charAt(i + 3));
			int e = Character.getNumericValue(numberString.charAt(i + 4));
			
			int product = a * b * c * d * e;
			if (product > greatestProduct) {
				greatestProduct = product;
			}
		}
		
		return greatestProduct;												//Return greatest product
	}
	
	public static String getNumAsString() {
		String numAsString = "";											//Start with blank string
		FileReader fileReader;
		try {
			String filepath = PATH_TO_FILE;
			fileReader = new FileReader(new File(filepath));				//Get a file reader for the file
		} catch (FileNotFoundException e) {
			System.out.println("Oops! File not found!");
			return "";
		}
		
		BufferedReader br = new BufferedReader(fileReader);					//Wrap fileReader in a bufferedReader
		
		String currentLine = getLine(br);
		while (currentLine != null) {										//Get every line from the file and concat it onto the numAsString then return it
			numAsString += currentLine;
			currentLine = getLine(br);
		}
		
		return numAsString;
	}
	
	public static String getLine(BufferedReader br) {						//try/catch block for getLine from bufferedReader
		String line;
		try {
			line = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
		return line;
	}
}
