package BAEK10039;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;


public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int total_score = 0;
		
		for(int i=0; i<5; i++) {
			int score = Integer.parseInt(br.readLine());
			if(score < 40) {
				score = 40;
			}
			total_score += score;
		}
		int result = total_score/5;
		bw.write(result+"\n");
		br.close();
		bw.flush();
		bw.close();
		
	}

}
