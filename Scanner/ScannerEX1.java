package Scanner;

import java.util.Scanner;

public class ScannerEX1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String str;
		
		System.out.println("insert string line.");
		str = scanner.nextLine();
		
		System.out.println("[result]");
		System.out.println(str);
		
	}
}
