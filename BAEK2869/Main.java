package BAEK2869;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		String num = br.readLine();
		st = new StringTokenizer(num);
		
		double A = Integer.parseInt(st.nextToken());
		double B = Integer.parseInt(st.nextToken());
		double V = Integer.parseInt(st.nextToken());
		
		int day = (int)Math.ceil((V-B)/Math.abs(A-B));
		System.out.print(day);
		
	}
}
