package BAEK1712;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] input_arr = input.split(" ");
		int A = Integer.parseInt(input_arr[0]);
		int B = Integer.parseInt(input_arr[1]);
		int C = Integer.parseInt(input_arr[2]);
		
		
		if(B>=C) System.out.print(-1); 
		
		else {
			int point = A/(C-B)+1;
			System.out.print(point);
		}
	}
}
