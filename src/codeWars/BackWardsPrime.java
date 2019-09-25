package codeWars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class BackWardsPrime {

	public static void main(String[] args) {
		/**
 Backwards Read Primes are primes that when read backwards in base 10 (from right to left) are a different prime. (This rules out primes which are palindromes.)

Examples:
13 17 31 37 71 73 are Backwards Read Primes
13 is such because it's prime and read from right to left writes 31 which is prime too. Same for the others.

Task
Find all Backwards Read Primes between two positive given numbers (both inclusive), the second one always being greater than or equal to the first one. 
The resulting array or the resulting string will be ordered following the natural order of the prime numbers.

Example
backwardsPrime(2, 100) => [13, 17, 31, 37, 71, 73, 79, 97] backwardsPrime(9900, 10000) => [9923, 9931, 9941, 9967] backwardsPrime(501, 599) => []

Note for Forth
Return only the first backwards-read prime between start and end or 0 if you don't find any

backwardsPrime(2, 100) => "13 17 31 37 71 73 79 97"
backwardsPrime(9900, 10000) => "9923 9931 9941 9967"
		 **/

		int start = 9900;
		int end = 10000;

		String result = backwardsPrime(start, end);
		System.out.println(result);

	}

	public static String backwardsPrime(long start, long end) {
		// Verified that the start number is minor than the end number
		if (start > end) {
			return "0";
		}

		ArrayList<Long> primeNotPalindromes = new ArrayList<Long>();
		ArrayList<Long> primes = new ArrayList<Long>();

		// discover the prime number in the input range
		findPrimesInRange(start, end, primes);

		// find out which primes are not palindromes
		getPrimesThatArentPalindromes(primeNotPalindromes, primes);

		// read to a string
		String result = null;
		for (Long long1 : primeNotPalindromes) {
			result = result == null ? long1.toString() : result + " " + long1.toString();
		}
		return result == null ? "" : result;
	}

	private static void findPrimesInRange(long start, long end, ArrayList<Long> primes) {
		// discover the prime number in the input range
		for (; start <= end; start++) {
			boolean isPrimeNumber = true;
			long m = start / 2;

			for (int i = 2; i <= m; i++) {
				if (start % i == 0) {
					// is not prime number
					isPrimeNumber = false;
					break;
				}
			}

			if (Boolean.TRUE.equals(isPrimeNumber)) {
				// System.out.println(start + " is prime number");
				primes.add(start);
			}
		}
	}

	private static void getPrimesThatArentPalindromes(ArrayList<Long> primeNotPalindromes, ArrayList<Long> primes) {
		// find out which primes are not palindromes
		for (int i = 0; i < primes.size(); i++) {
			String prime = primes.get(i).toString();
			int primeSize = prime.length();
			String mirrorPrime = "";

			if (primeSize > 1) {
				for (int j = prime.length(); j > 0; j--) {
					mirrorPrime += prime.substring(j - 1, j);
				}

				// discover the prime number in the input range
				ArrayList<Long> isMirrorPrimeAPrime = new ArrayList<Long>();
				findPrimesInRange(Long.parseLong(mirrorPrime), Long.parseLong(mirrorPrime), isMirrorPrimeAPrime);

				if (!prime.equals(mirrorPrime) && !isMirrorPrimeAPrime.isEmpty()
						//&& primes.contains(Long.parseLong(mirrorPrime))
						) {
					primeNotPalindromes.add(Long.parseLong(prime));
				}
			}
		}

		// order the numbers
		Collections.sort(primeNotPalindromes);
	}

	/*********************************************************************************************************************/
	public static String backwardsPrimeOtherSolution(long start, long end) {
		StringBuilder sb = new StringBuilder();
		while (start <= end) {
			int rev = Integer.parseInt(new StringBuilder(String.valueOf(start)).reverse().toString());
			if (start > 12 && isPrimeOtherSolution(rev) && isPrimeOtherSolution(start) && start != rev)
				sb.append(start + " ");
			start++;
		}
		return sb.toString().trim();
	}

	static boolean isPrimeOtherSolution(long n) {
		if (n % 2 == 0)
			return false;
		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	/*********************************************************************************************************************/
	public static String backwardsPrimeOtherSolution2(long start, long end) {
		return LongStream.range(start, end + 1).parallel().filter(x -> !isPalidrome(x)).filter(x -> isPrime(x))
				.filter(x -> isPrime(backwards(x))).boxed().map(String::valueOf).collect(Collectors.joining(" "));
	}

	private static boolean isPrime(long number) {
		if (number % 2 == 0)
			return false;
		for (long i = 2; i < number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	private static long backwards(long number) {
		return Long.parseLong(new StringBuffer(String.valueOf(number)).reverse().toString());
	}

	private static boolean isPalidrome(long number) {
		return number == backwards(number);
	}
}
