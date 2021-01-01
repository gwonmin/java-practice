package BAEK2292;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int num = 1;
		int count = 1;
		
		while(num < n) {
			num += count*6;
			count++;
		}
		
		System.out.print(count);
	}
}
