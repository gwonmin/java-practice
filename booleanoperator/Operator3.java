package booleanoperator;
//��Ʈ ������, ����Ʈ ������
public class Operator3 {
	//10�� ������ 2������ ��ȯ�ϴ� �޼���
	static String toBinaryString(int number) {
		String zero = "00000000000000000000000000000000";
		String binary = zero + Integer.toBinaryString(number);
		return binary.substring(binary.length()-32);
		
	}
	
	public static void main(String[] agrs) {
		
		int x = 10; //2������ ��ȯ�� 1010
		int y = 12; //2������ ��ȯ�� 1100
		
		System.out.println("x = \t"+toBinaryString(x));
		System.out.println("y = \t"+toBinaryString(y));
		System.out.println("x|y = \t"+toBinaryString(x|y));
		System.out.println("x&y = \t"+toBinaryString(x&y));
		System.out.println("x^y = \t"+toBinaryString(x^y));
		System.out.println("~x = \t"+toBinaryString(~x));
		
		System.out.println("x = \t\t"+toBinaryString(x));
		System.out.println("x >> 1 = \t"+toBinaryString(x >> 1));//���������� 1ĭ �̵�
		System.out.println("x >> 2 = \t"+toBinaryString(x >> 2));//���������� 2ĭ �̵�
		System.out.println("y = \t\t"+toBinaryString(y));
		System.out.println("y << 1 = \t"+toBinaryString(y << 1));//�������� 1ĭ �̵�
		System.out.println("y << 2 = \t"+toBinaryString(y << 2));//�������� 2ĭ �̵�
		//���� ����Ʈ�� 2��n���� ���� ����� ����
		//������ ����Ʈ�� 2��n���� ���� ����� ����
	}
	

}
