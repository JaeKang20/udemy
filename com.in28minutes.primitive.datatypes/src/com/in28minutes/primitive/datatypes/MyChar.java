package com.in28minutes.primitive.datatypes;

public class MyChar {
	private char ch;

	public char getCh() {
		return ch;
	}

	public void setCh(char ch) {
		this.ch = ch;
	}

	// capsulation.
	public MyChar(char ch) { // char type constructor
		this.ch = ch;
	}


	public boolean isVowel() { // boolean return.
		// logic operator what should i do? and / or / not
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { // LowerCase
			// or operator
			return true;
		}

//		if(Character.toUpperCase(ch)=='A');{
//			return true;
//		}
		if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') { // UpperCase
			// or operator
			return true;
		}
		return false;
	}

	public boolean isConsonant() {
		if (isAlphabet() && !(isVowel()))
			return true;

		return false;

	}

	public boolean isNumber() {
		if (ch >= 48 && ch <= 57) { // 0 ~ 9 is true
			return true;
		}
		return false;
	}

	public boolean isAlphabet() {
		if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) { // A-Z, a-z
			return true;
		}
		return false;
	}

	public static void printLowerCaseAlphabets() {
		char LowCase;
		System.out.println("this is Low Case alpahbet.");
		for (LowCase = 'a'; LowCase <= 'z'; LowCase++) {
			System.out.println(LowCase);
		}
	}

	public static void printUpperCaseAlphabets() {
		char UpperCase;
		System.out.println("this is Upper Case alpahbet.");
		for (UpperCase = 65; UpperCase < 91; UpperCase++) {
			System.out.println(UpperCase);
		}
	}

}
