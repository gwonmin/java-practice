package BAEK1546;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String [] str_score = br.readLine().split(" ");
		
		double M = Integer.MIN_VALUE;
		double sum = 0;
		
		for(int i=0; i<N; i++) {
			M = Math.max(M, Integer.parseInt(str_score[i]));
		}
		
		for(int i=0; i<N; i++) {
			double score = Integer.parseInt(str_score[i]);
			sum += score/M*100;
		}

		System.out.print(sum/N);
	}
}
