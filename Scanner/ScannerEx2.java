package Scanner;

import java.util.Scanner;

public class ScannerEx2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String name, strAge;
		int age;
		
		System.out.println("insert your name!");
		name = scanner.nextLine();
		
		System.out.println("insert your age!");
		strAge = scanner.nextLine();
		age = Integer.parseInt(strAge);
		
		System.out.printf("your name is %s.%n", name);
		System.out.printf("your age is %d.%n", age);
		
	}
}
