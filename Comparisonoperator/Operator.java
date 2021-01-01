package Comparisonoperator;

public class Operator {
	public static void main(String[] args) {
		//대소비교 연산자 <> <= >=
		
		//'A'유니코드:65, 'B'유니코드:66
		System.out.printf("'A'>'B' \t 결과:%b%n", 'A'>'B');
		System.out.printf("'A'<'B' \t 결과:%b%n", 'A'<'B');
		
		int x = 100;
		
		//등가비교 연산자 == !=
		
		System.out.printf("x >= 100 \t 결과:%b%n", x >= 100);
		System.out.printf("x <= 10 \t 결과:%b%n", x <= 10);
		
		System.out.printf("10 == 10.0f \t 결과:%b%n", 10 == 10.0f);//float형으로 자동변환 후 비교
		System.out.printf("'1' == 1 \t 결과:%b%n", '1'== 1);//문자'1'의 유니코드는 49
		System.out.printf("'A'+1 == 'B' \t 결과:%b%n", 'A'+ 1 =='B');
		
		System.out.printf("x != 100 \t 결과:%b%n", x != 100);//같지 않을 경우 true
		
		String str1 = "Hello";
		String str2 = new String("Hello");
		
		System.out.printf("str1 == \"Hello\" \t결과:%b%n", str1 == "Hello");
		System.out.printf("str2 == \"Hello\" \t결과:%b%n", str2 == "Hello");
		
		//문자열 비교시에는 equals() 메소드를 사용해야 한다.
		System.out.printf("str2.equals(\"Hello\") \t결과:%b%n", str2.equals("Hello"));
		//str1의 경우는 String은 클래스이지만 특별한 경우로 기본자료형처럼 표현하여 사용할 수 있게 허용.
		//str2이 경우는 정식 방법대로 new를 사용하여 객체를 생성하고 그 안에 "Hello"라는 문자열을 저장.
		//이런 경우에는 str2에 문자열이 저장되는 것이 아니고 문자열이 저장된 주소가 저장.
		//그러므로 문자열을 비교할 때 주소값이 저장되어 있는지 값이 저장되어 있는지 신경쓰지 않고 비교를 하려면 equals()메소드를 사용.
		
	}
}
