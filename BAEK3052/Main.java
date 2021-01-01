package BAEK3052;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int count = 0;
		
		for(int i=0; i<10; i++) {
		int n = Integer.parseInt(br.readLine());
		int remain = n%42;
		String str_re = Integer.toString(remain);
		sb.append(str_re).append(" ");
		}
		
		String [] str = sb.toString().split(" ");
		
		for(int i=0; i<9; i++) {
			for(int j=i+1; j<10; j++) {
				if(str[i].equals(str[j])) {
					count++;
					break;
				}
			}
		}
		br.close();
		System.out.print(10-count);
		
	}
}
