package ASCII;

public class AtoZ {
	public static void main(String[] args) {
		char A_str = 65; //알파벳 시작 문자열: A
		
		while(true) {
			if(A_str == 91) 
				A_str = 97;//특수문자 시작시 알파벳 소문자로 고정
			
			String str = String.valueOf(A_str);
			
			System.out.println(str);
			
			A_str++; //아스키값 증가
			
			if(A_str > 122) break; //알파벳 소문자z가 끝날시 종료
		}
	}
}
