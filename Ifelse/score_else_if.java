package Ifelse;

import java.util.Scanner;

public class score_else_if {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���.");
		String input = scanner.nextLine();
		int score = Integer.parseInt(input);
		char grade = ' ';
		
		if(score >= 90) grade = 'A';
		
		else if(score >= 80) grade = 'B';
		
		else if(score >= 70) grade = 'C';
		
		else if(score >= 60) grade = 'D';
		
		else grade = 'F';
		
		System.out.println("����� ������: "+grade);
		
	
	}
}
