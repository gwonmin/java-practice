package BAEK2438;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		
		for(int i=0; i<N; i++) {
			sb1.append("*");
			sb2.append(sb1).append("\n");
		}
		System.out.print(sb2.toString());
		br.close();
	}
}