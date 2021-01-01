package BAEK1330;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //객체 할당
		String strN = sc.nextLine(); //입력
		String [] strN_array = strN.split(" "); // 공백 기준으로 분할하고 배열에 입력
		
		// 문자열에서 정수형으로 형변환
		int num1 = Integer.parseInt(strN_array[0]); 
		int num2 = Integer.parseInt(strN_array[1]);
		
		if(num1 > num2) {
			System.out.print(">");
		}
		else if(num1 < num2) {
			System.out.print("<");
		}
		else {
			System.out.print("==");
		}
	}
}
