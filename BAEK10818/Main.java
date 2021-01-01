package BAEK10818;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		ArrayList<Integer> num_list = new ArrayList<>();
		int N = Integer.parseInt(br.readLine());
		String str_num = br.readLine();
		st = new StringTokenizer(str_num);
		
		for(int i=0; i<N; i++) {
			num_list.add(Integer.parseInt(st.nextToken()));
		}
		
		num_list.sort(null);
		
		System.out.print(num_list.get(0)+" "+num_list.get(N-1));
	
	}
}
