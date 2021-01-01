package Ifelse;

import java.util.Scanner;

public class if_if {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("당신의 나이를 입력하세요.");
		String input1 = scanner.nextLine();
		int age = Integer.parseInt(input1);
		
		System.out.println("팔굽혀펴기 횟수를 입력하세요.");
		String input2 = scanner.nextLine();
		int score = Integer.parseInt(input2);
		String grade = "";
		
		if(age <= 25) {
			
			if(score >= 72) grade = "특급";
			
			else if(score >= 64) grade = "1급";
			
			else if(score >= 56) grade = "2급";
		
		}
		else if(age <= 30) {
			
			if(score >= 70) grade = "특급";
			
			else if(score >= 62) grade = "1급";
			
			else if(score >= 54) grade = "2급";
		
		}
		
		System.out.println("팔굽혀펴기 등급: "+grade);
		
	}
}
