package BAEK1330;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //��ü �Ҵ�
		String strN = sc.nextLine(); //�Է�
		String [] strN_array = strN.split(" "); // ���� �������� �����ϰ� �迭�� �Է�
		
		// ���ڿ����� ���������� ����ȯ
		int num1 = Integer.parseInt(strN_array[0]); 
		int num2 = Integer.parseInt(strN_array[1]);
		
		if(num1 > num2) {
			System.out.print(">");
		}
		else if(num1 < num2) {
			System.out.print("<");
		}
		else {
			System.out.print("==");
		}
	}
}
