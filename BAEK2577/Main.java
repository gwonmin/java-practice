package BAEK2577;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int mul_ABC = A*B*C;
		
		
		String str_ABC = Integer.toString(mul_ABC);

		
		for(int j=0; j<10; j++) {
			int n = 0;
			for(int i=0; i<str_ABC.length(); i++)  {
				
				String str_j = Integer.toString(j); //0~9¼ýÀÚ
				
				if(str_ABC.substring(i, i+1).equals(str_j)) {
					n++;
				}
				
			}
			System.out.println(n);
		}
	}
}

