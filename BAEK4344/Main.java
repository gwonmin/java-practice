package BAEK4344;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(br.readLine());
		double student = 0;
		double score = 0;
		double sum = 0;
		double count = 0;
		double avg = 0;
		
		for(int i=0; i<C; i++) {
			String [] str_n = br.readLine().split(" ");
			student = Integer.parseInt(str_n[0]);
			
			for(int j=1; j<=student; j++) {
				score = Integer.parseInt(str_n[j]); 
				sum += score;
			}
			
			avg = sum/student;
			
			for(int j=1; j<=student; j++) {
				score = Integer.parseInt(str_n[j]);
				if(score > avg) {
					count++;
				}
			}
			
			double result = count/student*100;
			
			System.out.printf("%.3f", result);
			System.out.println("%");
			sum = 0;
			count = 0;

		}
	}
}
