package Array;

public class array {
	public static void main(String[] args) {
		
		int [] array = {10, 11, 15};
		String [] fruits = {"사과", "딸기", "수박"};
		
		System.out.println(array[0]);
		System.out.println(fruits[0]);
		
		String [] fruits_array = new String [3]; //크기 3인 배열 생성
		
		//미리 만들어 놓은 빈 공간에 값을 채워넣는 방법
		fruits_array[0] = "사과";
		fruits_array[1] = "딸기";
		fruits_array[2] = "수박";
		
		//for문으로 배열 출력
		for(int i = 0; i<fruits_array.length;i++) {
			System.out.println(fruits_array[i]);			
		}
		
		//while문으로 배열 출력
		int i = 0;
		while(i<fruits_array.length) {
			System.out.println(fruits_array[i]);
			i++;
			
		}
		
	}
}
