package Array;

import java.util.Random;

public class multi_array {
	public static void main(String[] args) {
		
		Random r = new Random(); //랜덤 값을 가져오기 위해 선언
		
		int [][] practice2 = new int[3][3]; //3x3 사이즈 배열 메모리 할당
		
		for(int i=0; i < practice2.length ;i++) {
			for(int j=0; j < practice2.length ;j++) {
				practice2[i][j] = -1; // 0~8을 출력하기 위해
			}
		}
		int num; //랜덤 값 변수
		boolean condition = false; //중복이 있을 시 반복문을 처음부터 돌리기 위함
		
		for(int i=0; i < practice2.length ; i++) {
			for(int j=0; j <practice2.length ; j++) {
				
				num = r.nextInt(9); // 0~8 사이 랜덤 값 가져오기
				
				if(!(i==0 && j==0)) { //제일 처음 항목은 비교할 필요가 없기 때문
					for(int k=0;k<practice2.length;k++) {
						int t = 0;
						while(t < practice2.length) {
							if(num == practice2[k][t]) { //중복일 경우
								condition = true; //중복임을 표시
								num = r.nextInt(9); //새로운 랜덤 값
							}else {
								condition = false; // 중복이 아님을 표시
							}
							t++;
							if(condition == true) { //중복일 경우 초기화 처음부터 다시 비교
								k = 0;
								t = 0;
							}
						}
					}
				}								
				practice2[i][j] = num; //중복되지 않은 최종 값을 배열에 저장
				
				System.out.println("index ("+i+","+j+") " + practice2[i][j]);
			
			}
		}
	}
}
