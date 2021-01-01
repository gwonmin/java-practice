package BAEK10871;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String [] NX = br.readLine().split(" ");
		int N = Integer.parseInt(NX[0]);
		int X = Integer.parseInt(NX[1]);
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		
		for(int i=0; i<N; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(X > num) {
				sb.append(num).append(" ");
			}
		}
		br.close();
		System.out.print(sb.toString().trim());
	}
}
