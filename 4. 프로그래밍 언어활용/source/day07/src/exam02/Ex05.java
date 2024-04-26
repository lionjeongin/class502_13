package exam02;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex05 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("a.txt")) { // 자원해제 부분을 파이널에 넣을 필요가 없다. 해제가 필요한 객체생성해서 넣어주기
            AutoCloseable auto = fis;

        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
/*
알아서 close가 호출된다.
try-with-resources : 자원해제 자동화 기능
 */