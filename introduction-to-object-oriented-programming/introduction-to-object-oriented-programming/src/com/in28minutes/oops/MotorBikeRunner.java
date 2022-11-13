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

		System.out.println("ducati speed is :");
		System.out.println(ducati.getSpeed());

		honda.decreasSpeed(101);
		System.out.println("honda speed is :");
		System.out.println(honda.getSpeed());

	}

}
