package codeWars;

public class SquareEveryDigit {

	public static void main(String[] args) {

		int number = 9119;

		int x = squareEveryDigit(number);
		System.out.println(x);
	}

	/**
	 * Square every digit of a number. For example, if we run 9119 through the
	 * function, 811181 will come out, because 9^2 is 81 and 1^2 is 1. Note: The
	 * function accepts an integer and returns an integer
	 * 
	 * @param n,
	 *            number to square their digits
	 * @return integer which is the result of square every digit of the given
	 *         number
	 */
	public static int squareEveryDigit(int n) {
		String result = "";

		// convert (in case of) negative digit to positive
		n = Math.abs(n);
		
		String numberStr = String.valueOf(n);

		for (int i = 0; i < numberStr.length(); i++) {
			// get the digit
			int num = Integer.parseInt(numberStr.substring(i, i + 1));

			// square every digit and add to a string of result
			result += num * num;
		}

		// return the result as an int
		return Integer.parseInt(result);
	}

	/**
	 * other soluction
	 * 
	 * @param n
	 * @return
	 */
	public int squareDigits(int n) {
		String s = n + "";
		String[] digits = s.split("");
		String output = "";

		for (String str : digits) {
			int i = Integer.parseInt(str);
			output += i * i;
		}

		return Integer.parseInt(output);
	}

	/*
	 * Persistent Bugger. Write a function, persistence, that takes in a
	 * positive parameter num and returns its multiplicative persistence, which
	 * is the number of times you must multiply the digits in num until you
	 * reach a single digit.
	 * 
	 * For example:
	 * 
	 * persistence(39) == 3 // because 3*9 = 27, 2*7 = 14, 1*4=4 // and 4 has
	 * only one digit
	 * 
	 * persistence(999) == 4 // because 9*9*9 = 729, 7*2*9 = 126, // 1*2*6 = 12,
	 * and finally 1*2 = 2
	 * 
	 * persistence(4) == 0 // because 4 is already a one-digit number
	 */
}
