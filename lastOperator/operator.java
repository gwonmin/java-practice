package lastOperator;
//증감 연산자
public class operator {
	public static void main(String[] args) {
		//증감 연산자의 독립 사용
		
		int i = 1, j = 0;
		
		i++; // i = i + 1
		System.out.println("i++의 결과: "+i);
		
		i = 1;
		++i; // i = i + 1
		System.out.println("++i의 결과: "+i);
		
		i = 1;
		i--; //i = i - 1
		System.out.println("i--의 결과: "+i);
		
		i = 1;
		--i; //i = i - 1
		System.out.println("--i의 결과: "+i);
		
		i = 1;
		j = i++; // 연산 과정: [1] j = i를 실행 [2] i를 1증가
		System.out.printf("j = i++의 결과: i=%d, j=%d%n", i,j);
		
		i = 1;
		j = 0;
		j = ++i; //연산 과정: [1] i를 1증가 [2] j = i를 실행
		System.out.printf("j = ++i의 결과: i=%d, j=%d%n", i,j);
		
		i = 1;
		j = 0;
		j = i--; //연산 과정: [1] j = i를 실행 [2] i를 1감소
		System.out.printf("j = i--의 결과: i=%d, j=%d%n", i,j);
		
		i = 1;
		j = 0;
		j = --i; //연산 과정: [1] i를 1감소 [2] j = i를 실행
		System.out.printf("j = --i의 결과: i=%d, j=%d%n", i,j);
		
		
	}
}
