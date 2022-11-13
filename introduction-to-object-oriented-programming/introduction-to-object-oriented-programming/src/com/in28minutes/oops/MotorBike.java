package com.in28minutes.oops;


public class MotorBike {
	/* state, 상태,변수라 불림 */ // private를 써서 캡슐화시킴
	private int speed; // member variable

	public MotorBike() {
		this(5);
	}

	public MotorBike(int speed) { // source > constructor 클릭
		this.speed = speed;

	}
	public void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed; // 오류를 미연에 방지 캡슐화의 이점.
		}

	}
	/* behaviour, act, 동작이라 불리는 것 */
	public int getSpeed() { // 값을 출력해준다.

		return speed;
	}

	public void increasSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
	}

	public void decreasSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);// 이렇게 하면 if문을 굳이 안써도 0보다 작게 될 수 없다.
		// 왜냐하면 이미 setSpeed에서 0보다 작을 수 없게 했기 때문
	}



	void start() {
		System.out.println("bike started");
	};

	void stop() {
		System.out.println("bike stoped");
	};
}

//public MotorBike(int speed) {
//this.speed = speed; // 가깝게 선언된 변수를 말하기 때문에 this는 상태를 의미하고 private된 변수에도 가능
//} // 생성자 주는 방법
