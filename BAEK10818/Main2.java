package BAEK10818;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		int min = Integer.MAX_VALUE; //정수타입 최대값 2147483647할당
		int max = Integer.MIN_VALUE; //정수타입 최솟값 -2147483648할당
		for(int i=0; i<N; i++) {
			int a = Integer.parseInt(st.nextToken());
			
			min = Math.min(min, a); //재귀
			max = Math.max(max, a); //재귀
		}
		System.out.print(min+" "+max);
		
	}
}
