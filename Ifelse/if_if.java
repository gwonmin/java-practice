package Ifelse;

import java.util.Scanner;

public class if_if {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("����� ���̸� �Է��ϼ���.");
		String input1 = scanner.nextLine();
		int age = Integer.parseInt(input1);
		
		System.out.println("�ȱ������ Ƚ���� �Է��ϼ���.");
		String input2 = scanner.nextLine();
		int score = Integer.parseInt(input2);
		String grade = "";
		
		if(age <= 25) {
			
			if(score >= 72) grade = "Ư��";
			
			else if(score >= 64) grade = "1��";
			
			else if(score >= 56) grade = "2��";
		
		}
		else if(age <= 30) {
			
			if(score >= 70) grade = "Ư��";
			
			else if(score >= 62) grade = "1��";
			
			else if(score >= 54) grade = "2��";
		
		}
		
		System.out.println("�ȱ������ ���: "+grade);
		
	}
}
