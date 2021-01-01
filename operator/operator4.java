package operator;

public class operator4 {
	public static void main(String[] args) {
		
		int x = 1000000;
		int y = 3000000;
		
		long result1 = x*y; //x,y의 연산결과는 이미 정수형
		long result2 = x*(long)y; //해결방법: 한쪽을 long으로 변환
		
		System.out.println(result1);
		System.out.println(result2);
		
	}
}
