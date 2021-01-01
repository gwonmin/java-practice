package BAEK5543;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] price = new int [5];
		
		for(int i=0; i<5; i++) {
			price[i] = Integer.parseInt(br.readLine());
		}
		System.out.print(Math.min(Math.min(price[0], price[1]),Math.min(price[1], price[2]))+Math.min(price[3], price[4])-50);
		br.close();
	}
}

