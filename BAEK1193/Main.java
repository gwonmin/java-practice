package BAEK1193;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int arr_num = 0;
		int count = 0;
		
		for(int i=1; i<=x; i++) {
			if(count == arr_num) {
				arr_num += 1;
				count = 0;
			}
			count++;
		}
		if(arr_num%2 == 0) {
			System.out.print(count+"/"+(arr_num-(count-1)));
		}
		else System.out.print((arr_num-(count-1))+"/"+count);
	}
}
