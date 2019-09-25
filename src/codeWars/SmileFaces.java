package codeWars;

import java.util.ArrayList;
import java.util.List;

public class SmileFaces {

	public static void main(String[] args) {
		/**
		 * Description: Given an array (arr) as an argument complete the
		 * function countSmileys that should return the total number of smiling
		 * faces. Rules for a smiling face: -Each smiley face must contain a
		 * valid pair of eyes. Eyes can be marked as : or ; -A smiley face can
		 * have a nose but it does not have to. Valid characters for a nose are
		 * - or ~ -Every smiling face must have a smiling mouth that should be
		 * marked with either ) or D. No additional characters are allowed
		 * except for those mentioned. Valid smiley face examples: :) :D ;-D :~)
		 * Invalid smiley faces: ;( :> :} :]
		 * 
		 * Example cases:
		 * 
		 * countSmileys([':)', ';(', ';}', ':-D']); // should return 2;
		 * countSmileys([';D', ':-(', ':-)', ';~)']); // should return 3;
		 * countSmileys([';]', ':[', ';*', ':$', ';-D']); // should return 1;
		 * 
		 * Note: In case of an empty array return 0. You will not be tested with
		 * invalid input (input will always be an array). Order of the face
		 * (eyes, nose, mouth) elements will always be the same Happy coding!
		 */

		List<String> arr = new ArrayList<String>();
		arr.add(":)");
		arr.add(":)");
		arr.add("x-]");
		arr.add(":ox");
		arr.add(";-(");
		arr.add(";-)");
		arr.add(";~(");
		arr.add(":~D");

		int countSmiley = countSmileys(arr);
		System.out.println("my count: " + countSmiley);

		countSmiley = countSmileysOtherSolution(arr);
		System.out.println("countSmileysOtherSolution: " + countSmiley);

		countSmiley = countSmileysOtherSolution1(arr);
		System.out.println("countSmileysOtherSolution1: " + countSmiley);

	}

	public static int countSmileys(List<String> arr) {
		// Define the rules for a smiling face
		ArrayList<Character> eyes = new ArrayList<Character>();
		eyes.add(':');
		eyes.add(';');
		ArrayList<Character> nose = new ArrayList<Character>();
		nose.add('-');
		nose.add('~');
		ArrayList<Character> mouth = new ArrayList<Character>();
		mouth.add(')');
		mouth.add('D');

		// count happy smileys on the given input
		int count = 0;
		for (String face : arr) {
			// if it is an happySmiley, add to counter
			if (face.length() == 2 && eyes.contains(face.charAt(0)) && mouth.contains(face.charAt(1))
					|| face.length() == 3 && eyes.contains(face.charAt(0)) && nose.contains(face.charAt(1))
							&& mouth.contains(face.charAt(2))) {
				count++;
			}
		}

		return count;
	}

	public static int countSmileysOtherSolution(List<String> arr) {
		String validSmilyFaces = ":) ;) :-) :~) ;-) ;~) :D ;D :-D :~D ;~D ;~) ;-D";

		int counter = 0;

		for (int i = 0; i < arr.size(); i++) {

			if (validSmilyFaces.contains(arr.get(i))) {
				counter++;
			}
		}
		return counter;
	}

	public static int countSmileysOtherSolution1(List<String> arr) {
		return (int) arr.stream().filter(x -> x.matches("[:;][-~]?[)D]")).count();
	}
}
