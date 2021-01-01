package IOmodule;


import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;



public class bw {
	public static void main(String[] args) throws IOException {
		//�ֿܼ� ���
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("hello\n"); //���ۿ� ����
		bw.newLine(); //����(�ٹٲ�)
		bw.write("I am writing\n");
		bw.flush();
		bw.close();
	}

}
/*
�� BufferedWriter �ż���

 

 - (void) close() : ��Ʈ���� �ݽ��ϴ�. �ݱ� ���� flushing �ʼ�.(Closes the stream, flushing it first.)

 - (void) flush() : ��Ʈ���� ���ϴ�.(Flushes the stream.)

 - (void) newLine() : ���๮�� ����.(Writes a line separator.)

 - (void) write(char[] cbuf, int offset, int length) : ���� offset��ġ���� lengthũ�⸸ŭ write ���ϴ�.

 - (void) write(int c) : �� ���� ����.(Writes a single character.)

 - (void) write(String s, int offset, int length) : ���ڿ����� offset���� ���� ���̸�ŭ ����.

                                                           (Writes a portion of a String.)

*/