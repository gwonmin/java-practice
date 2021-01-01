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
		String addr = "경기도";
		
		System.out.printf("줄바꿈 기능");
		System.out.printf("없음");
		
		System.out.printf("줄바꾸기%n");
		System.out.printf("성공!%n");
		
		System.out.printf("내 나이는 %d살 입니다.%n", age);
		System.out.printf("내 나이는 %d살이고 %s에 살고 있습니다.%n", age,addr);
		
		System.out.printf("자리수 미지정 :%d%n",1);
		System.out.printf("자리수 미지정 :%d%n",10);
		System.out.printf("자리수 미지정 :%d%n",100);
		System.out.printf("자리수 미지정 :%d%n",1000);
		
		System.out.printf("자리수 지정 :%4d%n",1);
		System.out.printf("자리수 지정 :%4d%n",10);
		System.out.printf("자리수 지정 :%4d%n",100);
		System.out.printf("자리수 지정 :%4d%n",1000);
		
		System.out.printf("자리수 지정('-'사용) :%-4d%n",1);
		System.out.printf("자리수 지정('-'사용) :%-4d%n",10);
		System.out.printf("자리수 지정('-'사용) :%-4d%n",100);
		System.out.printf("자리수 지정('-'사용) :%-4d%n",1000);
		
		System.out.printf("자리수 지정('0'사용) :%04d%n",1);
		System.out.printf("자리수 지정('0'사용) :%04d%n",10);
		System.out.printf("자리수 지정('0'사용) :%04d%n",100);
		System.out.printf("자리수 지정('0'사용) :%04d%n",1000);
		
		float f = 1.2345f;
		
		System.out.printf("소수점 자리수 미지정 : %f%n",f);
		System.out.printf("소수점 자리수 지정 : %.3f%n",f);
		
	}
}
