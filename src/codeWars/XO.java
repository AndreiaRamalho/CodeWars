package codeWars;

public class XO {
	/**
	Check to see if a string has the same amount of 'x's and 'o's. 
	The method must return a boolean and be case insensitive. 
	The string can contain any char.
	
	Examples input/output:
	
	XO("ooxx") => true
	XO("xooxx") => false
	XO("ooxXm") => true
	XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
	XO("zzoo") => false
	**/
	
	public static void main(String[] args) {
		String str = "xXxxoewrcoOoo";
		System.out.println(getXO(str));
		System.out.println(getXOOtherSolution(str));
	}

	public static boolean getXO(String str) {
		int countX = 0, countO = 0;
		str=str.toUpperCase();

		for (int i = 0; i < str.length(); i++) {
			if ("X".equals(str.substring(i, i+1))) {
				countX++;
			}

			if ("O".equals(str.substring(i, i+1))) {
				countO++;
			}
		}

		return countO == countX;
	}
	
	public static boolean getXOOtherSolution(String str) {
		str = str.toLowerCase();
		return str.replace("o", "").length() == str.replace("x", "").length();
	}
}
