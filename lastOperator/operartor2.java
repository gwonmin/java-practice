package lastOperator;
//���� ������

import java.util.Scanner;

public class operartor2 {
	public static void main(String[] args) {
		//���� ������ ? :
		
		int a = 10, b = 20;
		int result;
		
		//[1] ������ ����Ͽ� ����
		result = (a>b)? (a-b) : (b-a);
		System.out.println("[1]�� ���� ����: "+result);
		
		//[2] ������ ������� �ʰ� �ٷ� ���
		System.out.println("[2]�� ���� ����: "+ ((a>b)? (a-b) : (b-a)));
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���ĺ����� �Ǵ��� ���ڸ� �Է��ϼ���.");
		String strC = scanner.nextLine();
		char c = strC.charAt(0);
		System.out.println((('a'<=c && c<='z') || ('A'<=c && c<='Z'))? "�Է��� ���ڴ� ���ĺ��̴�." : "�Է��� ���ڴ� ���ĺ��� �ƴϴ�.");
	
	}
}
