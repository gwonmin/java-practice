package ForWhile;

import java.util.Scanner;

public class Whilerectan {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("마름모의 높이를 입력해주세요.(홀수)");
		String strH = sc.nextLine();
		int H = Integer.parseInt(strH);
	
		int i = 0;
		while(i < H) {
			int j = 0;
			while(j < H) {
				if(i <= H/2) {
					if(i+j <= H/2 - 1) {
						System.out.print(" ");
					}else if(j-i <= H/2) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				else {
					if(i-j >= H/2 + 1) {
						System.out.print(" ");
					}else if(i+j < (H/2)*3 + 1) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			j++;
			}
		i++;
		System.out.println("");
		}
		
	}
}