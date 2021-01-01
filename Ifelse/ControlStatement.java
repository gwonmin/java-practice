package Ifelse;

import java.util.Scanner;

public class ControlStatement {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("짝수 홀수를 판단할 숫자를 입력하세요.");
		String input = scanner.nextLine();
		int n = Integer.parseInt(input);
		
		//짝수일 때만 실행
		if(n%2 == 0) {
			System.out.println(n+"는 짝수입니다.");
		}
		//홀수일 때만 실행
		if(n%2 != 0) System.out.println(n+"는 홀수입니다.");
		//실행문장이 하나일 경우에는 괄호 생략 가능
	}
}
