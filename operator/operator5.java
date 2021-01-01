package operator;

import java.util.Scanner;

public class operator5 {
	public static void main(String[] args) {
		
		int x = 5;
		int y = 2;
		
		System.out.printf("%d를 %d로 나눈 몫:%d%n", x,y,x/y);
		System.out.printf("%d를 %d로 나눈 나머지:%d%n", x,y,x%y);

		String strNumber;
		int number, result;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("[홀/짝 판별] 숫자를 입력하세요.");
		strNumber = scanner.nextLine();
		number = Integer.parseInt(strNumber);
		result = number % 2;
		
		System.out.println("2로 나눈 결과값: "+result);
		
		char zero = '0';
		char nine = '9';
		
		int num = nine - zero;
		//[1]int num = '9' - '0';
		//[2]int num = 57 - 48;
		//[3]int num = 9;
		
		System.out.println(num);
		
		char c1 = 'A';
		
		int i = c1 + 1;
		//char c2 = c1 + 1; //에러 발생, 결과값은 정수형인 66
		char c2 = (char)(c1 + 1); //해결방법: 결과값을 char형으로 형변환
		
		System.out.println("i: "+i);
		System.out.println("c2: "+c2);
		
	}
}
