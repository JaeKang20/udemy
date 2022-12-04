package com.in28minutes.primitive.datatypes;

public class MyChar2 {
	private char ch; // 멤버변수는 코딩에서 제일 기본

	public void setCh(char ch) {
		this.ch = ch;
	}

	public char getCh() { // 캡슐화했기 때문에 get/set 메소드 필
		return ch;
	}


	// constoctor
	public MyChar2(char ch) {
		this.ch = ch;
	}

	public boolean isVowel() { // 모음
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			return true;
		}
		return false;
	}

	public boolean isNumber() {
		if(ch >=48 && ch<=57) {
			return true;
		}
		return false;
	}

	public boolean isAlphabet() {
		if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {
			return true;
		}
		return false;
	}

	public static void printLowerCaseAlphabets() {
		char lowCase;
		for (lowCase = 97; lowCase < 123; lowCase++) {
			System.out.println(lowCase);
		}
	}

	public static void printUpperCaseAlphabets() {
		char upperCase;
		for (upperCase = 65; upperCase < 91; upperCase++) {
			System.out.println(upperCase);
		}
	}
}
