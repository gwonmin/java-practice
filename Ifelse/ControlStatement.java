package Ifelse;

import java.util.Scanner;

public class ControlStatement {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("¦�� Ȧ���� �Ǵ��� ���ڸ� �Է��ϼ���.");
		String input = scanner.nextLine();
		int n = Integer.parseInt(input);
		
		//¦���� ���� ����
		if(n%2 == 0) {
			System.out.println(n+"�� ¦���Դϴ�.");
		}
		//Ȧ���� ���� ����
		if(n%2 != 0) System.out.println(n+"�� Ȧ���Դϴ�.");
		//���๮���� �ϳ��� ��쿡�� ��ȣ ���� ����
	}
}
