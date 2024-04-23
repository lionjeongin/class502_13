package exam02;
// java.io.FileNotFoundException  -> 파일이 없을 때 뜨는 오류
import java.io.FileInputStream;

public class Ex02 {
    public static void main(String[] args) {
        // throw new FileNotFoundException(...)
        //FileInputStream fis = new FileInputStream("a.txt");
    } //FileInputStream에 커서 갖다 대고 crtl + 왼쪽 마우스 클릭
}
 /*
 Ex01과 다르게 클래스 파일 생성 X -> 컴파일 자체가 안 된다.
 예외 체크는 컴파일 과정 중에 체크, 예외가 있으면 컴파일 X : 컴파일 예외

 runtime : 실행
 RuntimeException : 실행 과정 중에 예외가 체크 : 런타임 예외
 -> 실행

 runtime이 포함되어 있지 않으면 예외 체크 시점이 컴파일이고, 컴파일이 아예 안 된다.
 runtime이 포함되어 있으면 예외의 체크 시점이 실행 과정 중에 체크된다. 따라서 컴파일이 된다. ( = class 파일이 있다.)

 a.text 만들었을 때
 must be caught caught or decalred to be thrown
 -> 파일이 있든지 없든지 간에 예외 발생할 가능성이 있으니 오류 해결하거나 던져라 -> 무조건 처리해라
 컴파일 예외는 엄격한 예외이다.

 Ex02는 엄격한 예외, 형식을 매우 중시

 예외 발생해서 던진 거 잡기 : try-catch 문으로 잡는다.
 예외가 발생할 가능성이 있는 코드를 넣어놓고 적절한 처리를 한다.
 Throwable 클래스가 상속된 것만 던질 수 있다.
  */


