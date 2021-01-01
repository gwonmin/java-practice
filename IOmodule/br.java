package IOmodule;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class br {
	//BufferedReader 사용 시 예외처리 필수!
	public static void main(String[] args) throws Exception {
		
		// 콘솔 입력 시 BufferedReader 객체 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in);
		
		String s = br.readLine(); //String
		
		//readLine() 매서드 리턴값은 String이어서 숫자 입력시 형변환 필수!
		int N = Integer.parseInt(s);
		//int N = nextInt();
		
		String line="";
		//더 이상 입력값이 없을 때까지 1줄씩 읽는다.
		for(int i=0; (line=br.readLine()) != null; i++) {
			System.out.println(line);
		}
	}
}
/*
 ■ BufferedReader 매서드
 - (void) close() : 입력스트림을 닫는다.(Closes the stream and releases any system resources associated with it.)

 - (void) mark() : 스트림의 현재 위치를 마킹합니다.(Marks the present position in the system.)

 - (boolean) markSupported() : 스트림이 mark 기능을 지원하는지 true/false로 알려줍니다.

                                         (Tells whether this stream supports the mark() operation, which it does.)

 - (int) read() : 한 글자만 읽어 정수형으로 반환.(Reads a single character.)

 - (int) read(char[] cbuf, int offset, int length) : cbuf의 offset위치부터 length만큼 문자를 읽어옵니다.

                                                            (Reads characters into a portion of an array.)

 - (String) readLine() : 한 줄을 읽어 String으로 반환.(Reads a line of text.)

 - (boolean) ready() : 입력스트림이 사용할 준비가 되어있는지 확인.

                             (Tells whether this stream is ready to be read.)

 - (void) reset() : 마킹이 있으면 그 위치부터 다시 시작, 그렇지 않으면 처음부터 다시 시작합니다.

                      (Resets the stream to the most recent mark.)

 - (long) skip(long n) : n개의 문자를 건너뜁니다. (Skips characters.)
*/