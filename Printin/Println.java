package Printin;

import method.human;

public class Println {
	public static void main(String[] args) {
		
		int num = 10;
		String str = "Hello, Java!";
		
		System.out.println("Hello, World!");
		System.out.println(num);
		System.out.println(str);
		System.out.println("I'm "+num+" years old.");
		
		int age = 10;
		String addr = "��⵵";
		
		System.out.printf("�ٹٲ� ���");
		System.out.printf("����");
		
		System.out.printf("�ٹٲٱ�%n");
		System.out.printf("����!%n");
		
		System.out.printf("�� ���̴� %d�� �Դϴ�.%n", age);
		System.out.printf("�� ���̴� %d���̰� %s�� ��� �ֽ��ϴ�.%n", age,addr);
		
		System.out.printf("�ڸ��� ������ :%d%n",1);
		System.out.printf("�ڸ��� ������ :%d%n",10);
		System.out.printf("�ڸ��� ������ :%d%n",100);
		System.out.printf("�ڸ��� ������ :%d%n",1000);
		
		System.out.printf("�ڸ��� ���� :%4d%n",1);
		System.out.printf("�ڸ��� ���� :%4d%n",10);
		System.out.printf("�ڸ��� ���� :%4d%n",100);
		System.out.printf("�ڸ��� ���� :%4d%n",1000);
		
		System.out.printf("�ڸ��� ����('-'���) :%-4d%n",1);
		System.out.printf("�ڸ��� ����('-'���) :%-4d%n",10);
		System.out.printf("�ڸ��� ����('-'���) :%-4d%n",100);
		System.out.printf("�ڸ��� ����('-'���) :%-4d%n",1000);
		
		System.out.printf("�ڸ��� ����('0'���) :%04d%n",1);
		System.out.printf("�ڸ��� ����('0'���) :%04d%n",10);
		System.out.printf("�ڸ��� ����('0'���) :%04d%n",100);
		System.out.printf("�ڸ��� ����('0'���) :%04d%n",1000);
		
		float f = 1.2345f;
		
		System.out.printf("�Ҽ��� �ڸ��� ������ : %f%n",f);
		System.out.printf("�Ҽ��� �ڸ��� ���� : %.3f%n",f);
		
	}
}
