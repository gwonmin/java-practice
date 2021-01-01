package booleanoperator;
//부정 연산자
public class Operator2 {
	public static void main(String[] args) {
		
		boolean b = true;
		int i = 15;
		
		System.out.printf("b=%b, !b의 결과: %b%n", b, !b);
		System.out.printf("i=%d, !(i>10 && i<20)의 결과: %b%n", i, !(i>10 && i<20));
	
	}
}
