package Random;

import java.util.Random;

public class random {
	
	public static void main(String[] args) {
		
		Random random = new Random(); //�޸� Ȯ��
		
		int r_value = random.nextInt(6); // 0~5 ������ ������ ���� ��
		
		System.out.println(r_value);
		
	}
}
