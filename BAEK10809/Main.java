package BAEK10809;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine().toLowerCase();
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		
		int[] result_arr = new int[alpha.length()];
		
		for(int i=0; i<result_arr.length; i++) {
			String temp = alpha.substring(i,i+1);
			if(s.contains(temp)) {
				result_arr[i] = s.indexOf(temp);
			}
			else result_arr[i] = s.indexOf(temp);
		}
		
		
		for(int i=0; i<result_arr.length; i++) {
			System.out.print(result_arr[i]+" ");
		}	
	}
}
