package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<>();
		num.add(3);
		num.add(null); //null값도 add가능
		num.add(1,10); //index 1뒤에 10 삽입
		num.remove(1); //index 1 제거
		num.clear(); // 모든 값 제거
		num.size(); // list 크기 구하기
		//num.get(0); // 0번째 index 출력
			
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3));
		
		for(Integer i : list) { //for문을 통한 전체출력
			System.out.println(i);
		}
		
		Iterator iter = list.iterator(); //Iterator 선언
		while(iter.hasNext()) { //다음값이 있는지 체크
			System.out.println(iter.next()); //값 출력
		}
		
		System.out.println(list.contains(1)); //list에 1이 있는지 검색 : true
		System.out.println(list.indexOf(1)); //1이 있는 index반환, 없으면 -1
		
	}
}
