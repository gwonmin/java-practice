package operator;

public class Operator3 {
	public static void main(String[] args) {
		
		byte x = 10;
		byte y = 30;
		byte result1 = (byte)(x*y); //������ �ս� �߻�,byte���� ���� -128~127
		int result2 = x*y; //�ذ�å: ������ ������ ��´�.
		
		System.out.println("result1: "+result1);
		System.out.println("result2: "+result2);
		
	}
}
