package ForWhile;

import java.util.Scanner;

public class infiniteloop_for {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			String word = sc.next();
			System.out.println("�Է°�: "+word);
			
			if(word.equals("����")) break;
		}
	}
}
