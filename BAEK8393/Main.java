package BAEK8393;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;


public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String strN = br.readLine();
		int n = Integer.parseInt(strN);
		int sum = 0;
		
		for(int i=1; i <= n; i++) {
			sum += i;
		}
		bw.write(sum+"\n");
		
		br.close();
		bw.flush();
		bw.close();
	}
}
