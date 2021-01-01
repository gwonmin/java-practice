package IOmodule;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class br {
	//BufferedReader ��� �� ����ó�� �ʼ�!
	public static void main(String[] args) throws Exception {
		
		// �ܼ� �Է� �� BufferedReader ��ü ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in);
		
		String s = br.readLine(); //String
		
		//readLine() �ż��� ���ϰ��� String�̾ ���� �Է½� ����ȯ �ʼ�!
		int N = Integer.parseInt(s);
		//int N = nextInt();
		
		String line="";
		//�� �̻� �Է°��� ���� ������ 1�پ� �д´�.
		for(int i=0; (line=br.readLine()) != null; i++) {
			System.out.println(line);
		}
	}
}
/*
 �� BufferedReader �ż���
 - (void) close() : �Է½�Ʈ���� �ݴ´�.(Closes the stream and releases any system resources associated with it.)

 - (void) mark() : ��Ʈ���� ���� ��ġ�� ��ŷ�մϴ�.(Marks the present position in the system.)

 - (boolean) markSupported() : ��Ʈ���� mark ����� �����ϴ��� true/false�� �˷��ݴϴ�.

                                         (Tells whether this stream supports the mark() operation, which it does.)

 - (int) read() : �� ���ڸ� �о� ���������� ��ȯ.(Reads a single character.)

 - (int) read(char[] cbuf, int offset, int length) : cbuf�� offset��ġ���� length��ŭ ���ڸ� �о�ɴϴ�.

                                                            (Reads characters into a portion of an array.)

 - (String) readLine() : �� ���� �о� String���� ��ȯ.(Reads a line of text.)

 - (boolean) ready() : �Է½�Ʈ���� ����� �غ� �Ǿ��ִ��� Ȯ��.

                             (Tells whether this stream is ready to be read.)

 - (void) reset() : ��ŷ�� ������ �� ��ġ���� �ٽ� ����, �׷��� ������ ó������ �ٽ� �����մϴ�.

                      (Resets the stream to the most recent mark.)

 - (long) skip(long n) : n���� ���ڸ� �ǳʶݴϴ�. (Skips characters.)
*/