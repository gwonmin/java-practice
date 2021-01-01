package operator;

public class Operator {
	public static void main(String[] args) {
		
		int x = 5;
		int y = 2;
		
		System.out.printf("%d + %d = %d%n", x,y,x+y);
		System.out.printf("%d - %d = %d%n", x,y,x-y);
		System.out.printf("%d * %d = %d%n", x,y,x*y);
		System.out.printf("%d / %d = %d%n", x,y,x/y);
		System.out.printf("%d / %.1f = %.1f%n", x,(float)y,x/(float)y);
	}
}
