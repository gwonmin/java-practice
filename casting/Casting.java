package casting;

public class Casting {
	public static void main(String[] args) {
	
		double d1 = 1.1234;
		float f1 = (float)d1;
		System.out.println("[double -> float] d1 value: "+d1+", f1 value: "+f1);
		
		double d2 = 1.0e-50;
		float f2 = (float)d2;
		System.out.println("[double -> float] d2 value: "+d2+", f2 value: "+f2);
		
		double d3 = 1.0e100;
		float f3 = (float)d3;
		System.out.println("[double -> float] d3 value: "+d3+", f3 value: "+f3);
		
		double d4 = 9.123456789;
		float f4 = (float)d4;
		System.out.println("[detail differnce] d4 value: "+d4+", f4 value: "+f4);
		
		float f = 123456.67f;
		int i = (int)f;
		System.out.println("[float -> int] f value: "+f+"i value: "+i);
		
		double d = 12345.678;
		int i2 = (int)d;
		System.out.println("[double -> int] d value: "+d+"i2 value: "+i2);
	}
}
