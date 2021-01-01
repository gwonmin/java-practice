package Ifelse;

import java.util.Scanner;

public class score_grade {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		String input = scanner.nextLine();
		int score = Integer.parseInt(input);
		char grade = ' ';
		
		if(score >= 90) grade = 'A';
		
		if(score >= 80 && score <= 89) grade = 'B';
		
		if(score >= 70 && score <= 79) grade = 'C';
		
		if(score >= 60 && score <= 69) grade = 'D';
		
		if(score <= 59) grade = 'F';
		
		System.out.println("당신의 학점은: "+grade);
		
	}
}
