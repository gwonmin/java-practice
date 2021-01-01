package BAEK1316;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count = n;
		
		for(int i=0; i<n; i++) {
			String word = br.readLine();
			for(int j=1; j<word.length(); j++) {
				if((word.substring(j-1, j)).equals(word.substring(j, j+1)))
					continue;
				else {
					if(word.substring(j).contains(word.substring(j-1, j))) {
						count--;
						break;}
					else continue;
				}
			}
		}
		System.out.print(count);
	}
}
