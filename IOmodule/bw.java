package IOmodule;


import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;



public class bw {
	public static void main(String[] args) throws IOException {
		//콘솔에 출력
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("hello\n"); //버퍼에 쓰기
		bw.newLine(); //개행(줄바꿈)
		bw.write("I am writing\n");
		bw.flush();
		bw.close();
	}

}
/*
■ BufferedWriter 매서드

 

 - (void) close() : 스트림을 닫습니다. 닫기 전에 flushing 필수.(Closes the stream, flushing it first.)

 - (void) flush() : 스트림을 비웁니다.(Flushes the stream.)

 - (void) newLine() : 개행문자 쓰기.(Writes a line separator.)

 - (void) write(char[] cbuf, int offset, int length) : 버퍼 offset위치부터 length크기만큼 write 씁니다.

 - (void) write(int c) : 한 글자 쓰기.(Writes a single character.)

 - (void) write(String s, int offset, int length) : 문자열에서 offset부터 일정 길이만큼 쓰기.

                                                           (Writes a portion of a String.)

*/