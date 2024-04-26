package exam03;

public class Resources implements AutoCloseable {
    @Override
    public void close() throws Exception { // Generate에서 close 메서드 불러오기
        System.out.println("자원해제!!"); // close 메서드 호출
    }
}