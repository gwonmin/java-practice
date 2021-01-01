package BAEK11022;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=T; i++) {
			String [] num = br.readLine().split(" ");
			
			int A = Integer.parseInt(num[0]);
			int B = Integer.parseInt(num[1]);
			int sum = A+B;
			
			bw.write("Case #"+i+": "+A+" + "+B+" = "+sum+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
