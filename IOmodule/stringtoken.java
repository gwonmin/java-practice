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
■ StringTokenizer 매서드

 - (int) countTokens() : 남은 token의 갯수를 리턴.

 - (String) nextToken() : 다음 token을 리턴. 이전 token 제거.

 - (String) nextToken(String delim) : 구획문자를 delim으로 변경한 후 다음 token을 리턴.

 - (boolean) hasMoreTokens() : 리턴할 다음 token이 있으면 true, 없으면 false
	*/
		
		
		//TEST1 : 공백문자로 구분하여 출력
		st = new StringTokenizer(test1);
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println(st.countTokens());
		
		//TEST2 : "%"을 구획문자로 구분하여 출력
		st = new StringTokenizer(test2, "%");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		//TEST3 : "%", "$", "#"을 구획문자로 구분하여 출력 / 구획문자도 리턴
		st = new StringTokenizer(test3, "%$#", true);
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		//TEST4 : "%"를 구획문자로 구분하여 출력 하다가 "$"를 구획문자로 변경
		st = new StringTokenizer(test4, "%");
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken("$"));
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
	}
}
