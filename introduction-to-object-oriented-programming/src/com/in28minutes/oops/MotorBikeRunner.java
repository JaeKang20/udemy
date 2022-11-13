package com.in28minutes.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(200);
		MotorBike honda = new MotorBike(100); // 새로운객체 만들어보기

		MotorBike somethingElse = new MotorBike();
		System.out.println(somethingElse.getSpeed()); // 5 출력

		// ducati 속도를 100 올려볼까?
//		ducati.setSpeed(100);
		// get speed
		// increase it by 100;
		// set it to ducati
		ducati.increasSpeed(100);
		honda.increasSpeed(100);
		ducati.decreasSpeed(50);
		System.out.println(ducati.getSpeed());
		honda.decreasSpeed(101);
		System.out.println(honda.getSpeed());

//		int ducatiSpeed = ducati.getSpeed(); // ducati speed출력
//		ducatiSpeed += 100; // ducatiSpeed + 100;
//		ducati.setSpeed(ducatiSpeed); // Set it to ducati Speed
//		System.out.println(ducati.getSpeed());
//
//		int hondaSpeed = honda.getSpeed(); // honda Speed출력
//		hondaSpeed += 100; // hondaSpeed + 100;
//		honda.setSpeed(hondaSpeed); // Set it to honda Speed
//		System.out.println(honda.getSpeed());

	}

}
