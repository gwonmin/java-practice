package BAEK1157;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//ASCII코드 이용한 풀이

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] alpha = new int[26]; //알파벳갯수 카운트 배열생성
		int ch = br.read(); //입력한 문자를 ASCII코드로 한글자씩 저장
		while(ch >= 65) {
			if(ch > 96) ch = ch -32; //소문자 대문자로 변환
			alpha[ch-65]++; // 알파벳 갯수 카운트
			ch = br.read(); //다음 알파벳을 저장
		}
		int idx = 0, ans = 0;
		for(int i = 1; i< 26; i++) {
			if(alpha[idx] < alpha[i]) idx = ans = i; //알파벳갯수 비교
			else if(alpha[idx] == alpha[i]) ans = -2; //ASCII코드 63 -> "?"
		}
		System.out.print((char)(ans+65));
	}
}