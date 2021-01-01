package BAEK2941;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] cro = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		
		for(int i=0; i<cro.length; i++) {
			if(input.contains(cro[i])) {
				input = input.replace(cro[i], " ");
			}
		}
		System.out.print(input.length());
	}
}
