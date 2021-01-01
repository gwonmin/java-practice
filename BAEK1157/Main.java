package BAEK1157;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//ASCII�ڵ� �̿��� Ǯ��

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] alpha = new int[26]; //���ĺ����� ī��Ʈ �迭����
		int ch = br.read(); //�Է��� ���ڸ� ASCII�ڵ�� �ѱ��ھ� ����
		while(ch >= 65) {
			if(ch > 96) ch = ch -32; //�ҹ��� �빮�ڷ� ��ȯ
			alpha[ch-65]++; // ���ĺ� ���� ī��Ʈ
			ch = br.read(); //���� ���ĺ��� ����
		}
		int idx = 0, ans = 0;
		for(int i = 1; i< 26; i++) {
			if(alpha[idx] < alpha[i]) idx = ans = i; //���ĺ����� ��
			else if(alpha[idx] == alpha[i]) ans = -2; //ASCII�ڵ� 63 -> "?"
		}
		System.out.print((char)(ans+65));
	}
}