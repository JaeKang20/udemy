package com.in28minutes.oops;

public class BookRunner {

	public static void main(String[] args) {
		Book artBookOfComputerProgramming = new Book(); // 클래스는 대문자,메소드는 소문자. 객체 클래스는 소문자.
		// book클래스 인스턴스화시키기
		artBookOfComputerProgramming.setBookTitle("Art book of computer programming");

		Book effectiveJava = new Book(0);
		effectiveJava.setBookTitle("effective java");
		Book cleanCode = new Book(0);
		cleanCode.setBookTitle("clean code");

//		artBookOfComputerProgramming.setNoOfCopies(12);
		effectiveJava.setNoOfCopies(2);
		cleanCode.setNoOfCopies(3);

		artBookOfComputerProgramming.decreaseNoOfCopies(13);
		effectiveJava.decreaseNoOfCopies(3);
		cleanCode.decreaseNoOfCopies(3);

		System.out.println(artBookOfComputerProgramming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());
		System.out.printf("%s book has stack like this: %d\n", artBookOfComputerProgramming.getBookTitle(),
				artBookOfComputerProgramming.getNoOfCopies());
		System.out.printf("%s book has stack like this: %d\n", effectiveJava.getBookTitle(),
				effectiveJava.getNoOfCopies());
		System.out.printf("%s book has stack like this: %d", cleanCode.getBookTitle(), cleanCode.getNoOfCopies());

	}
}
