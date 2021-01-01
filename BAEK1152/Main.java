package BAEK1152;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int count = 0;
		String input = br.readLine();
		st = new StringTokenizer(input);

		for(int i = st.countTokens(); i>0; i--) {
			count++;
		}
		
		System.out.print(count);
	}
}
