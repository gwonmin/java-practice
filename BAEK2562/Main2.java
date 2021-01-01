package BAEK2562;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main2 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int maxIndex = 0;
		int maxNumber = 0;
		int number = 0;
		
		for(int i=0; i<9; ++i) {
			number = Integer.parseInt(br.readLine());
			
			if(maxNumber < number) {
				maxIndex = i;
				maxNumber = number;
			}
		}
		
		System.out.println(maxNumber);
		System.out.print(maxIndex+1);
	
	}
}
