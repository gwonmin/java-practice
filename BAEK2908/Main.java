package BAEK2908;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String input = br.readLine();
		String[] result = new String[2];
		
		st = new StringTokenizer(input);
		
		for(int i=0; i<2; i++) {
			String temp = st.nextToken();
			result[i] = temp.substring(2, 3)+temp.substring(1, 2)+temp.substring(0, 1);
			
		}
		
		int A = Integer.parseInt(result[0]);
		int B = Integer.parseInt(result[1]);
		if(A > B) 
				System.out.print(A);
		else System.out.print(B);
	}
}
