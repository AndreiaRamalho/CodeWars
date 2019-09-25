package codeWars;

import java.util.Arrays;
import java.util.Comparator;

public class Order {

	public static void main(String[] args) {

		/**
		 * Your task is to sort a given string. Each word in the string will
		 * contain a single number. This number is the position the word should
		 * have in the result.
		 * 
		 * Note: Numbers can be from 1 to 9. So 1 will be the first word (not
		 * 0).
		 * 
		 * If the input string is empty, return an empty string. The words in
		 * the input String will only contain valid consecutive numbers.
		 * 
		 * Examples "is2 Thi1s T4est 3a" --> "Thi1s is2 3a T4est" "4of Fo1r
		 * pe6ople g3ood th5e the2" --> "Fo1r the2 g3ood 4of th5e pe6ople" ""
		 * --> ""
		 **/

		String words = "Thi1s is2 3a T4est";
		String wordOrdered = order(words);
		System.out.println("my solution: " + wordOrdered);

//		System.out.println("\n");

		String wordOtherSolution = orderOtherSolution(words);
		System.out.println("wordOtherSolution: " + wordOtherSolution);

//		System.out.println("\n");

		String wordOtherSolution2 = orderOtherSolution2(words);
		System.out.println("wordOtherSolution2: " + wordOtherSolution2);

//		System.out.println("\n");

		String wordOtherSolution3 = orderOtherSolution2(words);
		System.out.println("wordOtherSolution3: " + wordOtherSolution3);
	}

	public static String order(String words) {
		// If the input string is empty, return an empty string.
		if (words.isEmpty()) {
			return words;
		}

		String stringOrdered = null;

		// search for the word by the number priority(Numbers can be from 1 to
		// 9). So 1 will be the first word (not 0).
		for (int i = 1; i <= 9; i++) {

			// Verify if not exists the current order number in any word of the
			// string, if not pass to next order number
			if (!words.contains(String.valueOf(i))) {
				continue;
			}

			// Otherwise, exists the current order number in the given string.
			// Then let's get that word with that number
			String selectedWord = "";
			/**
			 * the regex pattern used to match the word that contains the
			 * specific digit
			 */
			String pattern = "(\\S*\\d*[" + i + "]\\S*)";
			java.util.regex.Pattern r = java.util.regex.Pattern.compile(pattern);
			java.util.regex.Matcher m = r.matcher(words);

			// search on the string for a match word
			while (m.find()) {
				// System.out.println("\n Found word: " + m.group(1));

				// get the word
				selectedWord = m.group(1);

				// store the word in the string ordered by priority
				stringOrdered = stringOrdered == null ? selectedWord : stringOrdered + " " + selectedWord;
			}
		}

		// return the string ordered by number priority
		return stringOrdered;
	}

	public static String orderOtherSolution(String words) {
		return Arrays.stream(words.split(" "))
				.sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("\\D", ""))))
				.reduce((a, b) -> a + " " + b).get();
	}

	public static String orderOtherSolution2(String words) {
		String[] strs = words.split(" ");
		Arrays.sort(strs,
				(String s1, String s2) -> s1.replaceAll("[a-zA-Z]", "").compareTo(s2.replaceAll("[a-zA-Z]", "")));
		String f = "";
		for (String st : strs)
			f += st + " ";
		return f.substring(0, f.length() - 1);
	}

	public static String orderOtherSolution3(String words) {
		String[] arr = words.split(" ");
		StringBuilder result = new StringBuilder("");
		for (int i = 0; i < 10; i++) {
			for (String s : arr) {
				if (s.contains(String.valueOf(i))) {
					result.append(s + " ");
				}
			}
		}
		return result.toString().trim();
	}
}
