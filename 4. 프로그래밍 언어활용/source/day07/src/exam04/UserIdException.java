package exam04;

public class UserIdException extends RuntimeException { // extends RuntimeException 해줘서 던질 수 있는 클래스 예외를 발생 시킬 수 있다.
    // 관례적으로 예외 클래스를 만들 때 끝에는 Exception을 붙인다!

    public UserIdException(String message) {
        super(message); // 상위 클래스에 있는 생성자에게 처리를 위임한다
    }
}