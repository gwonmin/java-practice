package ForWhile;

import java.util.Scanner;

public class triangle {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ﰢ���� ���̸� �Է����ּ���.");
		String strH = sc.nextLine();
		int height = Integer.parseInt(strH);
		
		//���� �ﰢ��
		for(int i = 1; i <= height ; i++) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		//�̵ �ﰢ��
		for(int i = 1 ; i <= height ; i++) {
			for(int j = 0 ; j < height - i ; j++) {
				System.out.print(" ");
			}
			for(int k = 1 ; k <= i ; k++) {
				System.out.print("*");
			}
			for(int t = 1 ; t < i ; t++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
