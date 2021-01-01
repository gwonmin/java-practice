package BAEK2675;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			String input = br.readLine();
			st = new StringTokenizer(input);
			
			int R = Integer.parseInt(st.nextToken());
			String S = st.nextToken();
			
			for(int k=0; k<S.length(); k++) {
				String temp = S.substring(k,k+1);
				for(int j=0; j<R; j++) {
				 sb.append(temp);
				}	
			}
			sb.append("\n");
		}
		br.close();
		System.out.println(sb.toString());
	}
}
