package ASCII;

public class AtoZ {
	public static void main(String[] args) {
		char A_str = 65; //���ĺ� ���� ���ڿ�: A
		
		while(true) {
			if(A_str == 91) 
				A_str = 97;//Ư������ ���۽� ���ĺ� �ҹ��ڷ� ����
			
			String str = String.valueOf(A_str);
			
			System.out.println(str);
			
			A_str++; //�ƽ�Ű�� ����
			
			if(A_str > 122) break; //���ĺ� �ҹ���z�� ������ ����
		}
	}
}
