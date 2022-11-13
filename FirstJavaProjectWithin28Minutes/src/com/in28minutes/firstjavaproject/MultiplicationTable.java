package com.in28minutes.firstjavaproject;


public class MultiplicationTable {
	void print() {
		print(3);
	}
	void print(int table) {
		print(table, 1, 10);
	}
	void print(int table, int from, int to ) {
			for(int i=from;i<=to;i++) { 
				System.out.printf("%d * %d = %d\n", table,i ,table*i ); 
				} //from에서 to까지 출력하기로 오버로드 가능!
	}
	


} // 이 클래스의 사례들을 만들어야 견본을 쓸 수 있다.
		
