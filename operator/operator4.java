package operator;

public class operator4 {
	public static void main(String[] args) {
		
		int x = 1000000;
		int y = 3000000;
		
		long result1 = x*y; //x,y�� �������� �̹� ������
		long result2 = x*(long)y; //�ذ���: ������ long���� ��ȯ
		
		System.out.println(result1);
		System.out.println(result2);
		
	}
}
