package BAEK10817;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int score[] = new int[3];
		
		for(int i=0; i<3; i++) {
			score[i] = Integer.parseInt(st.nextToken()); 
		}
		
		for(int i=0; i<2; i++) {
			for(int j = i+1; j<3; j++) {
				if(score[i] > score[j]) {
					int tmp = score[i];
					score[i] = score[j];
					score[j] = tmp;
				}
			}
		}
		System.out.print(score[1]);
		br.close();
		
	}
}
