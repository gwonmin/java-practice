package Array;

public class array {
	public static void main(String[] args) {
		
		int [] array = {10, 11, 15};
		String [] fruits = {"���", "����", "����"};
		
		System.out.println(array[0]);
		System.out.println(fruits[0]);
		
		String [] fruits_array = new String [3]; //ũ�� 3�� �迭 ����
		
		//�̸� ����� ���� �� ������ ���� ä���ִ� ���
		fruits_array[0] = "���";
		fruits_array[1] = "����";
		fruits_array[2] = "����";
		
		//for������ �迭 ���
		for(int i = 0; i<fruits_array.length;i++) {
			System.out.println(fruits_array[i]);			
		}
		
		//while������ �迭 ���
		int i = 0;
		while(i<fruits_array.length) {
			System.out.println(fruits_array[i]);
			i++;
			
		}
		
	}
}
