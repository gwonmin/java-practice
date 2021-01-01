package BAEK2588;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String strN1 = sc.nextLine(); //(1) 숫자입력
		int N1 = Integer.parseInt(strN1); // (1) 문자열에서 정수로 형변환
		String strN2 = sc.nextLine(); //(2)숫자 입력
		
		//(2)숫자 형변환 후 자리수별 할당
		int N2_0 = Integer.parseInt(strN2.substring(0,1)); 
		int N2_1 = Integer.parseInt(strN2.substring(1,2));
		int N2_2 = Integer.parseInt(strN2.substring(2,3));
		int N2 = Integer.parseInt(strN2);

		System.out.println(N1*N2_2);
		System.out.println(N1*N2_1);
		System.out.println(N1*N2_0);
		System.out.println(N1*N2);
		
	}
}
