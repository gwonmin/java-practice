package Ifelse;

import java.util.Scanner;

public class even_odd_num {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("짝수,홀수를 판단할 숫자를 입력하세요.");
		String input = scanner.nextLine();
		int n = Integer.parseInt(input);
		
		if(n%2==0) System.out.println(n+"는 짝수입니다.");
		
		else System.out.println(n+"는 홀수입니다.");
		
	}
}
