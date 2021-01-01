package BAEK2439;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb2 = new StringBuilder();
		StringBuilder sb3 = new StringBuilder();
		
		for(int i=1; i<=N; i++) {
			StringBuilder sb1 = new StringBuilder();
			for(int j=0; j<(N-i); j++) {
				sb1.append(" ");
			}
			sb2.append("*");
			sb3.append(sb1).append(sb2).append("\n");
		}
		br.close();
		System.out.print(sb3.toString());
	}
}
