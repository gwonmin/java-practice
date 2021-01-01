package BAEK2562;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<9; i++) {
			int n = Integer.parseInt(br.readLine());
			sb.append(n).append(" ");
			max = Math.max(max, n);
		}
		st = new StringTokenizer(sb.toString().trim());
		int count = 1;
		
		while(Integer.parseInt(st.nextToken()) != max) {
			count += 1;
		}
		br.close();
		System.out.println(max);
		System.out.print(count);
	}
}
