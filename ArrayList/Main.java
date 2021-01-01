package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<>();
		num.add(3);
		num.add(null); //null���� add����
		num.add(1,10); //index 1�ڿ� 10 ����
		num.remove(1); //index 1 ����
		num.clear(); // ��� �� ����
		num.size(); // list ũ�� ���ϱ�
		//num.get(0); // 0��° index ���
			
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3));
		
		for(Integer i : list) { //for���� ���� ��ü���
			System.out.println(i);
		}
		
		Iterator iter = list.iterator(); //Iterator ����
		while(iter.hasNext()) { //�������� �ִ��� üũ
			System.out.println(iter.next()); //�� ���
		}
		
		System.out.println(list.contains(1)); //list�� 1�� �ִ��� �˻� : true
		System.out.println(list.indexOf(1)); //1�� �ִ� index��ȯ, ������ -1
		
	}
}
