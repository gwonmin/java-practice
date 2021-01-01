package operator;

public class Operator3 {
	public static void main(String[] args) {
		
		byte x = 10;
		byte y = 30;
		byte result1 = (byte)(x*y); //데이터 손실 발생,byte형의 범위 -128~127
		int result2 = x*y; //해결책: 정수형 변수에 담는다.
		
		System.out.println("result1: "+result1);
		System.out.println("result2: "+result2);
		
	}
}
