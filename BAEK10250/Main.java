package BAEK10250;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			String num = br.readLine();
			st = new StringTokenizer(num);
			
			double H = Integer.parseInt(st.nextToken());
			double W = Integer.parseInt(st.nextToken());
			double N = Integer.parseInt(st.nextToken());
			int ansH = 0;
			int ansW = (int) Math.ceil(N/H);
			
			if(N%H == 0) ansH = (int) H;
			else ansH = (int) (N%H);
			
			sb.append(ansH).append(String.format("%02d", ansW)).append("\n");
		}
		System.out.print(sb.toString());
	}
}
