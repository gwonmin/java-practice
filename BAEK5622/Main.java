package BAEK5622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = br.read();
		int time = 0;
		
		while(input >= 65){
			if(input <= 67) time += 3;
			else if(input <= 70) time += 4;
			else if(input <= 73) time += 5;
			else if(input <= 76) time += 6;
			else if(input <= 79) time += 7;
			else if(input <= 83) time += 8;
			else if(input <= 86) time += 9;
			else if(input <= 90) time += 10;
			input = br.read();
			}
		System.out.print(time);
	}
} 