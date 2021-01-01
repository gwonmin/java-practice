package booleanoperator;
//비트 연산자, 쉬프트 연산자
public class Operator3 {
	//10진 정수를 2진수로 변환하는 메서드
	static String toBinaryString(int number) {
		String zero = "00000000000000000000000000000000";
		String binary = zero + Integer.toBinaryString(number);
		return binary.substring(binary.length()-32);
		
	}
	
	public static void main(String[] agrs) {
		
		int x = 10; //2진수로 변환시 1010
		int y = 12; //2진수로 변환시 1100
		
		System.out.println("x = \t"+toBinaryString(x));
		System.out.println("y = \t"+toBinaryString(y));
		System.out.println("x|y = \t"+toBinaryString(x|y));
		System.out.println("x&y = \t"+toBinaryString(x&y));
		System.out.println("x^y = \t"+toBinaryString(x^y));
		System.out.println("~x = \t"+toBinaryString(~x));
		
		System.out.println("x = \t\t"+toBinaryString(x));
		System.out.println("x >> 1 = \t"+toBinaryString(x >> 1));//오른쪽으로 1칸 이동
		System.out.println("x >> 2 = \t"+toBinaryString(x >> 2));//오른쪽으로 2칸 이동
		System.out.println("y = \t\t"+toBinaryString(y));
		System.out.println("y << 1 = \t"+toBinaryString(y << 1));//왼쪽으로 1칸 이동
		System.out.println("y << 2 = \t"+toBinaryString(y << 2));//왼쪽으로 2칸 이동
		//왼쪽 쉬프트는 2에n승을 곱한 결과와 같다
		//오른쪽 쉬프트는 2에n승을 나눈 결과와 같다
	}
	

}
