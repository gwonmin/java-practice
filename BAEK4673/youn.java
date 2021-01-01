package BAEK4673;

public class youn {
	public static void main(String[] args) {

		boolean[] check = new boolean[10000];
		
		for(int i=1; i<=check.length; i++) {
			int n = d(i);
			if(n<=10000) check[n-1] = true;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<10000; i++) {
			if(!check[i]) //持失切 端滴
				sb.append(i+1).append("\n");
		}
	System.out.print(sb.toString());
	}
	
	static int d(int n) {
		int sum = n;
		while(n != 0) {
			sum += n%10;
			n /= 10;
		}
		return sum;
	}
}
	
