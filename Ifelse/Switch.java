package Ifelse;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���.");
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
		//switch�� ���� if��ó�� ��ø ��� ����, if���� ���� ����.
		System.out.println("����� ������: "+grade);
		
	}
}
