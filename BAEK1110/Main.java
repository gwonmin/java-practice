package BAEK1110;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int cycle = 0;
		int result = N;
		
		do {
			result = (result%10*10)+(result/10+result%10)%10;
			cycle++;
			
		} while(result != N);
		
		System.out.print(cycle);
	}
}
