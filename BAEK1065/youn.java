package BAEK1065;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class youn {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.print(one_num(n));
		}
	
	public static int one_num(int n) {
		
		int count = 0;
		
		if(n < 100)	count = n;
		else {
			
			for(int i=100; i<=n; i++) {
				double n1 		= 0;
				double n10 	= 0;
				double n100	= 0;
				n1 = i%10;
				n10 = (i-(i/100*100))/10;
				n100 = i/100;
				if((n1+n100)/2 == n10) count++;
			}
			count += 99;
		}
		return count;
	}
}
