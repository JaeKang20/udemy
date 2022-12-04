package com.in28minutes.primitive.datatypes;

public class MyCharRunner {

	public static void main(String[] args) {
		MyChar2 myChar2 = new MyChar2('o');
		System.out.println(myChar2.isVowel());
		System.out.println(myChar2.getCh());
		System.out.println(myChar2.isNumber());
		System.out.println(myChar2.isAlphabet());
		MyChar2.printLowerCaseAlphabets();
		MyChar2.printUpperCaseAlphabets();

	}

}
