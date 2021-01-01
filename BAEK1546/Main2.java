package BAEK1546;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		String str_score = br.readLine();
		st = new StringTokenizer(str_score);

		double M = 0;
		double sum = 0;
		
		while(st.hasMoreTokens()) {
			double temp = Integer.parseInt(st.nextToken());
			M = Math.max(M, temp);
			sum += temp;
		}
		
		System.out.print(sum/M*100/N);
		
	}
}
