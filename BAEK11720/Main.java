package BAEK11720;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int sum = 0;
		int n = Integer.parseInt(br.readLine());
		String str_n = br.readLine();
		
		for(int i=0; i<n; i++) {
			sb.append(str_n.substring(i, i+1)).append(" ");
		}
		st = new StringTokenizer(sb.toString());
		
		while(st.hasMoreTokens()) {
			sum += Integer.parseInt(st.nextToken());
		}
		
		System.out.print(sum);
		
	}
}
