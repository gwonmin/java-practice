package Comparisonoperator;

public class Operator {
	public static void main(String[] args) {
		//��Һ� ������ <> <= >=
		
		//'A'�����ڵ�:65, 'B'�����ڵ�:66
		System.out.printf("'A'>'B' \t ���:%b%n", 'A'>'B');
		System.out.printf("'A'<'B' \t ���:%b%n", 'A'<'B');
		
		int x = 100;
		
		//��� ������ == !=
		
		System.out.printf("x >= 100 \t ���:%b%n", x >= 100);
		System.out.printf("x <= 10 \t ���:%b%n", x <= 10);
		
		System.out.printf("10 == 10.0f \t ���:%b%n", 10 == 10.0f);//float������ �ڵ���ȯ �� ��
		System.out.printf("'1' == 1 \t ���:%b%n", '1'== 1);//����'1'�� �����ڵ�� 49
		System.out.printf("'A'+1 == 'B' \t ���:%b%n", 'A'+ 1 =='B');
		
		System.out.printf("x != 100 \t ���:%b%n", x != 100);//���� ���� ��� true
		
		String str1 = "Hello";
		String str2 = new String("Hello");
		
		System.out.printf("str1 == \"Hello\" \t���:%b%n", str1 == "Hello");
		System.out.printf("str2 == \"Hello\" \t���:%b%n", str2 == "Hello");
		
		//���ڿ� �񱳽ÿ��� equals() �޼ҵ带 ����ؾ� �Ѵ�.
		System.out.printf("str2.equals(\"Hello\") \t���:%b%n", str2.equals("Hello"));
		//str1�� ���� String�� Ŭ���������� Ư���� ���� �⺻�ڷ���ó�� ǥ���Ͽ� ����� �� �ְ� ���.
		//str2�� ���� ���� ������ new�� ����Ͽ� ��ü�� �����ϰ� �� �ȿ� "Hello"��� ���ڿ��� ����.
		//�̷� ��쿡�� str2�� ���ڿ��� ����Ǵ� ���� �ƴϰ� ���ڿ��� ����� �ּҰ� ����.
		//�׷��Ƿ� ���ڿ��� ���� �� �ּҰ��� ����Ǿ� �ִ��� ���� ����Ǿ� �ִ��� �Ű澲�� �ʰ� �񱳸� �Ϸ��� equals()�޼ҵ带 ���.
		
	}
}
