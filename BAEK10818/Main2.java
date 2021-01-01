package BAEK10818;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		int min = Integer.MAX_VALUE; //����Ÿ�� �ִ밪 2147483647�Ҵ�
		int max = Integer.MIN_VALUE; //����Ÿ�� �ּڰ� -2147483648�Ҵ�
		for(int i=0; i<N; i++) {
			int a = Integer.parseInt(st.nextToken());
			
			min = Math.min(min, a); //���
			max = Math.max(max, a); //���
		}
		System.out.print(min+" "+max);
		
	}
}
