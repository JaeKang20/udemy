package com.in28minutes.oops;

public class Book {
	private int noOfCopies; // book 클래스의 새로운 상태를 준다.
	private String bookTitle;

	public Book() { // 이 생성자는 (10번째줄 주석참고)
		this(1000);
	}

	public Book(int noOfCopies) { // 이 생성자를 호출함
		this.noOfCopies = noOfCopies;
	}

	public Book(String bookTitle) {
		super();
		this.bookTitle = bookTitle;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		if (noOfCopies >= 0) {
			this.noOfCopies = noOfCopies;
		}
	}

	void increaseNoOfCopies(int howMuch) {
		setNoOfCopies(this.noOfCopies + howMuch);
	}

	void decreaseNoOfCopies(int howMuch) {
		setNoOfCopies(this.noOfCopies - howMuch);
	}
}
