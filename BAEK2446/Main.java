package BAEK2446;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i <2*N-1; i++) {
			if(i < N) {
				for(int j=0; j<i; j++ ) {
					sb.append(" ");
				}
				for(int j=2*N-1; i*2<j; j--) {
					sb.append("*");
				}
				sb.append("\n");
			}
			
			else {
				for(int j=2*N-1; i+1<j; j--) {
					sb.append(" ");
				}
				for(int j=2*(N-1)-1; j<i*2; j++) {
					sb.append("*");
				}
				sb.append("\n");
			}
		}
		
	br.close();
	System.out.print(sb.toString());
	}
}
