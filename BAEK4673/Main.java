package BAEK4673;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		for(int t: self_num()) {
			System.out.println(t);
		}
	}
	
	public static ArrayList<Integer> self_num() {
		int constructor = 0;
		ArrayList<Integer> con_list = new ArrayList<Integer>();
		for(int i=1; i<=10000; i++) {
			constructor = i + i/1000 + (i-(i/1000*1000))/100 + (i-(i/100*100))/10 + i%10;
			con_list.add(constructor);
		}
		con_list.sort(null);

		ArrayList<Integer> self_list = new ArrayList<Integer>();
		
		for(int i=1; i<=10000; i++) {
			if(con_list.contains(i)) continue;
			else self_list.add(i);
		}
		
		return self_list;
	}
}
