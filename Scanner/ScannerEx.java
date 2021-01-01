package Scanner;

import java.util.Scanner;


public class ScannerEx {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String name, address;
		int age;
		double weight;
		
		
		System.out.println("please insert your name, address, age, weight in a row with space.");
		name = scanner.next();
		address = scanner.next();
		age = scanner.nextInt();
		weight = scanner.nextDouble();
		
		System.out.printf("your name is %s.%n", name);
		System.out.printf("your address is %s.%n", address);
		System.out.printf("your age is %d.%n", age);
		System.out.printf("your weight is %.1fkg.%n", weight);
		
	}
}
