package variable;

public class StringMethod {
	public static void main(String[] args) {
		
		String a = "Hello, World.";
		boolean result1;
		boolean result2;
		
		result1 = a.equals("World");
		result2 = a.equals("Hello, World.");
		
		System.out.println("\"World\" is same:"+result1);
		System.out.println("\"Hello, World.\" is same:"+result2);
		
	}
}
