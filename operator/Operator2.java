package operator;

public class Operator2 {
	public static void main(String[] args) {
		
		byte x = 10;
		byte y = 30;
		//byte result = x + y; // 에러 발생
		byte result = (byte)(x+y);
		
		System.out.println(result);
		
	}
}
