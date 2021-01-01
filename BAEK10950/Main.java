package BAEK10950;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		StringTokenizer st;
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter inbw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(inbr.readLine());
		
		for(int i=0; i<T; i++) {
			//String [] word = inbr.readLine().split(" ");
			String num = inbr.readLine();
			st = new StringTokenizer(num);
			inbw.write(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+"\n");
			//inbw.write(Integer.parseInt(word[0])+Integer.parseInt(word[1])+"\n");
		}
		inbr.close();
		inbw.flush();
		inbw.close();
	}
}