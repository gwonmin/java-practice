package booleanoperator;
//�� ������
import java.util.Scanner;

public class Operator {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//[1] 10 < x < 20�� �ִ��� �Ǵ�
		System.out.println("[1] 10�� 20 ���̿� �ִ��� �Ǵ��� ���� x�� �Է��ϼ���.");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);
		System.out.printf("x=%d, x > 10 && x < 20 �ΰ�? %b%n", x, x>10 && x<20);
		System.out.println();
		
		//[2] i�� 2�� ��� �Ǵ� 3�� ������� �Ǵ�
		System.out.println("[2] 2�� ��� �Ǵ� 3�� ������� �Ǵ��� ���� i�� �Է��ϼ���.");
		String strI = scanner.nextLine();
		int i = Integer.parseInt(strI);
		System.out.printf("i=%d, i%%2 == 0 || i%%3 == 0 �ΰ�? %b%n", i, i%2 == 0 || i%3 == 0);
		System.out.println();
		
		//[3] c�� �˹������� �ƴ��� �Ǵ�
		System.out.println("[3] ���ĺ����� �Ǵ��� ���� c�� �Է��ϼ���.");
		String strC = scanner.nextLine();
		char c = strC.charAt(0); //String -> char�� ��ȯ�ϴ� �޼ҵ�
		System.out.printf("c=%c, �Է��� ���ڴ� ���ĺ��ΰ�? %b%n", c, ('a'<=c && c<='z') || ('A'<=c && c<='Z'));
		
	}
}
