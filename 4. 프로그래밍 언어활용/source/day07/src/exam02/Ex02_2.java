package exam02;
// Ex02를 try-catch문으로 예외 처리하기
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex02_2 {
    public static void main(String[] args) {
        // throw new FileNotFoundException(...)
        try {
            FileInputStream fis = new FileInputStream("b.txt");

            System.out.println("파일 처리"); // 예외 때문에 던져져서 결과 안 나온다.

        } catch (FileNotFoundException e) {
            //System.out.println("예외 발생!");
            //String message = e.getMessage();
            //System.out.println(message); //  결과 : b.txt (지정된 파일을 찾을 수 없습니다)
            e.printStackTrace(); // 오류가 발생한 위치부터 가장 아래는 오류가 파생된 위치
        }

        System.out.println("매우 중요한 실행 코드...");
    }
}
/*
-> 결과
예외 발생!
b.txt (지정된 파일을 찾을 수 없습니다)
매우 중요한 실행 코드...

예외(문제)가 발생했을 때 가장 중요한 것!
문제 해결이 중요하지만 원인을 모른다.
예외 발생했을 때 예외에 대한 정보를 제공한다.
java 문서에서 정보를 확인해 볼 수 있는 주요 메서드가 정의되어 있다.
FileNotFoundException에 원인 해결 메서드가 없다면 상위 클래스에 있다.
Throwable에 있다!
getMessage(), printStackTrace() 2개만 알고 있자!
- String getMessage() - 오류 메세지 확인
- void printStackTrace() :

 */