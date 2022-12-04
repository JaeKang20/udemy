package com.in28minutes.primitive.datatypes;

public class BiNumber {
	private int number1;// member variable
	private int number2;

	public BiNumber(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2; // local variable
	}

	public BiNumber() {
		this.number1 = 30;
	}
	int add() { // add 메소드
		return number1 + number2;
	}

	int multiply() { // multiply 메소드
		return number1 * number2;
	}

	void doubleValue() {
		number1 *= 2;
		number2 *= 2;

	}

	public int getNumber1() {
		return number1;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}
}
