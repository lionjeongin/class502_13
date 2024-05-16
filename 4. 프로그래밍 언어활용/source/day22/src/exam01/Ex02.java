package exam01;

import java.io.IOException;
import java.io.PrintStream;

public class Ex02 {
    public static void main(String[] args) throws IOException {
        PrintStream out = new PrintStream("20240516.log");
        System.setErr(out);
        String str = null;
        str.toUpperCase();
    }
}
/* 결과
20240516.log 파일 생성되고, 오류 내용이 안에 들어가있다.
 */
