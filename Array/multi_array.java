package Array;

import java.util.Random;

public class multi_array {
	public static void main(String[] args) {
		
		Random r = new Random(); //���� ���� �������� ���� ����
		
		int [][] practice2 = new int[3][3]; //3x3 ������ �迭 �޸� �Ҵ�
		
		for(int i=0; i < practice2.length ;i++) {
			for(int j=0; j < practice2.length ;j++) {
				practice2[i][j] = -1; // 0~8�� ����ϱ� ����
			}
		}
		int num; //���� �� ����
		boolean condition = false; //�ߺ��� ���� �� �ݺ����� ó������ ������ ����
		
		for(int i=0; i < practice2.length ; i++) {
			for(int j=0; j <practice2.length ; j++) {
				
				num = r.nextInt(9); // 0~8 ���� ���� �� ��������
				
				if(!(i==0 && j==0)) { //���� ó�� �׸��� ���� �ʿ䰡 ���� ����
					for(int k=0;k<practice2.length;k++) {
						int t = 0;
						while(t < practice2.length) {
							if(num == practice2[k][t]) { //�ߺ��� ���
								condition = true; //�ߺ����� ǥ��
								num = r.nextInt(9); //���ο� ���� ��
							}else {
								condition = false; // �ߺ��� �ƴ��� ǥ��
							}
							t++;
							if(condition == true) { //�ߺ��� ��� �ʱ�ȭ ó������ �ٽ� ��
								k = 0;
								t = 0;
							}
						}
					}
				}								
				practice2[i][j] = num; //�ߺ����� ���� ���� ���� �迭�� ����
				
				System.out.println("index ("+i+","+j+") " + practice2[i][j]);
			
			}
		}
	}
}
