package IOmodule;

import java.util.StringTokenizer;

public class stringtoken {
	public static void main(String[] args) {
		String test1 = "this is test String";
		String test2 = "this%is%test%%String";
		String test3 = "this%is$test#String";
		String test4 = "this%%is%$test$String";
		
		StringTokenizer st;
/*
�� StringTokenizer �ż���

 - (int) countTokens() : ���� token�� ������ ����.

 - (String) nextToken() : ���� token�� ����. ���� token ����.

 - (String) nextToken(String delim) : ��ȹ���ڸ� delim���� ������ �� ���� token�� ����.

 - (boolean) hasMoreTokens() : ������ ���� token�� ������ true, ������ false
	*/
		
		
		//TEST1 : ���鹮�ڷ� �����Ͽ� ���
		st = new StringTokenizer(test1);
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println(st.countTokens());
		
		//TEST2 : "%"�� ��ȹ���ڷ� �����Ͽ� ���
		st = new StringTokenizer(test2, "%");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		//TEST3 : "%", "$", "#"�� ��ȹ���ڷ� �����Ͽ� ��� / ��ȹ���ڵ� ����
		st = new StringTokenizer(test3, "%$#", true);
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		//TEST4 : "%"�� ��ȹ���ڷ� �����Ͽ� ��� �ϴٰ� "$"�� ��ȹ���ڷ� ����
		st = new StringTokenizer(test4, "%");
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken("$"));
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
	}
}
