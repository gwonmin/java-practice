package BAEK2292;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int output = 2;
		int limit = 6;
		int temp = 0; 
		
		if(N==1) {
			System.out.print(1);
		}
		else {
			for(int i=8; i<=N; i++) {			
				if(i%limit == 2) {
					temp = 6*output;
					limit = limit + temp;
					output++;
				}
			}
			System.out.print(output);
		}
	}
}
