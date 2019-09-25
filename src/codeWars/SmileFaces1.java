package codeWars;

import java.util.ArrayList;
import java.util.List;

public class SmileFaces1 {
	public static final List<Character> EYES = getEyesList();
	public static final List<Character> NOSES = getNoseList();
	public static final List<Character> MOUTHS = getMouthList();

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
	}

	public static int countSmileys(List<String> arr) {
		return (int) arr.stream().filter(smiley -> isSmiley(smiley)).count();
	}

	private static Boolean isSmiley(String smiley) {
		if (isEyes(smiley.charAt(0)) && isMouth(smiley.charAt(smiley.length() - 1))) {
			if (smiley.length() == 2)
				return true;
			if (smiley.length() == 3 && isNose(smiley.charAt(1)))
				return true;
		}
		return false;
	}

	private static Boolean isEyes(Character character) {
		return EYES.contains(character);
	}

	private static Boolean isNose(Character character) {
		return NOSES.contains(character);
	}

	private static Boolean isMouth(Character character) {
		return MOUTHS.contains(character);
	}

	private static final List<Character> getEyesList() {
		List<Character> eyesList = new ArrayList();
		eyesList.add(':');
		eyesList.add(';');
		return eyesList;
	}

	private static final List<Character> getNoseList() {
		List<Character> noseList = new ArrayList();
		noseList.add('-');
		noseList.add('~');
		return noseList;
	}

	private static final List<Character> getMouthList() {
		List<Character> mouthList = new ArrayList();
		mouthList.add(')');
		mouthList.add('D');
		return mouthList;
	}
}
