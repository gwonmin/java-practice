package BAEK2588;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String strN1 = sc.nextLine(); //(1) �����Է�
		int N1 = Integer.parseInt(strN1); // (1) ���ڿ����� ������ ����ȯ
		String strN2 = sc.nextLine(); //(2)���� �Է�
		
		//(2)���� ����ȯ �� �ڸ����� �Ҵ�
		int N2_0 = Integer.parseInt(strN2.substring(0,1)); 
		int N2_1 = Integer.parseInt(strN2.substring(1,2));
		int N2_2 = Integer.parseInt(strN2.substring(2,3));
		int N2 = Integer.parseInt(strN2);

		System.out.println(N1*N2_2);
		System.out.println(N1*N2_1);
		System.out.println(N1*N2_0);
		System.out.println(N1*N2);
		
	}
}
