package BAEK2884;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String time = sc.nextLine();
		String [] HM_array = time.split(" ");
		
		int H = Integer.parseInt(HM_array[0]);
		int M = Integer.parseInt(HM_array[1]);
		int total_M = H*60 + M;
		int new_total_M = total_M - 45;
		
		if(new_total_M < 0) {
			int new_H = 23;
			int new_M = 60 + new_total_M;
			System.out.print(new_H+" "+new_M);
		}
		else {
			int new_H = new_total_M / 60;
			int new_M = new_total_M % 60;
			System.out.print(new_H+" "+new_M);
		}
	}
}
