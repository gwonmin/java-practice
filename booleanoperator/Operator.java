package booleanoperator;
//논리 연산자
import java.util.Scanner;

public class Operator {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//[1] 10 < x < 20에 있는지 판단
		System.out.println("[1] 10과 20 사이에 있는지 판단할 숫자 x를 입력하세요.");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);
		System.out.printf("x=%d, x > 10 && x < 20 인가? %b%n", x, x>10 && x<20);
		System.out.println();
		
		//[2] i가 2의 배수 또는 3의 배수인지 판단
		System.out.println("[2] 2의 배수 또는 3의 배수인지 판단할 숫자 i를 입력하세요.");
		String strI = scanner.nextLine();
		int i = Integer.parseInt(strI);
		System.out.printf("i=%d, i%%2 == 0 || i%%3 == 0 인가? %b%n", i, i%2 == 0 || i%3 == 0);
		System.out.println();
		
		//[3] c가 알바펫인지 아닌지 판단
		System.out.println("[3] 알파벳인지 판단할 문자 c를 입력하세요.");
		String strC = scanner.nextLine();
		char c = strC.charAt(0); //String -> char로 변환하는 메소드
		System.out.printf("c=%c, 입력한 문자는 알파벳인가? %b%n", c, ('a'<=c && c<='z') || ('A'<=c && c<='Z'));
		
	}
}
