package Random;

import java.util.Random;

public class random {
	
	public static void main(String[] args) {
		
		Random random = new Random(); //메모리 확보
		
		int r_value = random.nextInt(6); // 0~5 사이의 랜덤한 정수 값
		
		System.out.println(r_value);
		
	}
}
