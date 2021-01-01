package Ifelse;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		String input = scanner.nextLine();
		int score = Integer.parseInt(input);
		char grade = ' ';
		
		switch(score/10) {
			case 10:
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			default:
				grade = 'F';
				
		}
		//switch문 역시 if문처럼 중첩 사용 가능, if문과 조합 가능.
		System.out.println("당신의 학점은: "+grade);
		
	}
}
