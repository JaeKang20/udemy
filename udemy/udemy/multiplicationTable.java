package udemy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class multiplicationTable {
			public static void main(String[] args) {

			System.out.println("당신이 출력하고 싶은 구구단은? : ");

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			// BufferedReader사용하여 내가 원하는 구구단 입력
			try {
				int i = Integer.parseInt(br.readLine()); //
				System.out.println("당신이 원한 구구단은 " + i+ "이다."); 
				multipleTableExam(i); //구구단 테이블 exam 메소드 실행
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} 
			}
			
			public static void multipleTableExam(int i) { //구구단 테이블 exam 메소드

				for (int j=1; j<10; j++) {

					int k = i * j;

					System.out.println(i+"*"+j+"="+k);
				}
			}
		
	}

		