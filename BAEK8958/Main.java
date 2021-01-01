package BAEK8958;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int total_score = 0;
		int score = 0;
		
		
		for(int k=0; k<T; k++) {
			String ox = br.readLine();
			for(int i=0; i<ox.length(); i++) {
				if(ox.substring(i, i+1) != null) {
					if(ox.substring(i, i+1).equals("O")) {
						score++;
						total_score += score;
					}
					else if(ox.substring(i, i+1).equals("X")) {
						score = 0;
					}
				}
			}
			System.out.println(total_score);
			total_score = 0;
			score = 0;
		}
	}
}
