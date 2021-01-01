package BAEK2839;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		if(N == 4 || N == 7) System.out.print(-1);
		else if(N%5 == 3) {
			System.out.print((N-3)/5+1);	
		}
		else if(N%5 == 4) {
			System.out.print((N-9)/5+3);
		}
		else if(N%5 == 0) {
			System.out.print(N/5);
		}
		else if(N%5 == 1) {
			System.out.print((N-6)/5+2);
		}
		else if(N%5 == 2) {
			System.out.print((N-12)/5+4);
		}
	}
}
