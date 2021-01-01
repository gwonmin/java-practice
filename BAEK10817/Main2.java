package BAEK10817;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main2 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		if(A>=B && A>=C) {
			if(B>=C) {
				sb.append(B);
			}else {
				sb.append(C);
			}
		}
		else if(B>=A && B>=C) {
			if(A>=C) {
				sb.append(A);
			}else {
				sb.append(C);
			}
		}
		else if(C>=A && C>=B) {
			if(A>=B) {
				sb.append(A);
			}else {
				sb.append(B);
			}
		}
		System.out.print(sb.toString());
	}
}
