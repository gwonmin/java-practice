package lastOperator;
//조건 연산자

import java.util.Scanner;

public class operartor2 {
	public static void main(String[] args) {
		//조건 연산자 ? :
		
		int a = 10, b = 20;
		int result;
		
		//[1] 변수를 사용하여 저장
		result = (a>b)? (a-b) : (b-a);
		System.out.println("[1]두 수의 차이: "+result);
		
		//[2] 변수를 사용하지 않고 바로 출력
		System.out.println("[2]두 수의 차이: "+ ((a>b)? (a-b) : (b-a)));
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("알파벳인지 판단할 문자를 입력하세요.");
		String strC = scanner.nextLine();
		char c = strC.charAt(0);
		System.out.println((('a'<=c && c<='z') || ('A'<=c && c<='Z'))? "입력한 문자는 알파벳이다." : "입력한 문자는 알파벳이 아니다.");
	
	}
}
