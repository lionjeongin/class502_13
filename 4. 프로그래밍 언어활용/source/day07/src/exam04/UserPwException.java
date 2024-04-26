package exam04;

public class UserPwException extends Exception { // Exception의 바로 하위 클래스기 때문에 엄격한 예외
    public UserPwException(String message) {
        super(message); // 상위 클래스에 있는 생성자에게 처리를 위임
    }
}
// Exception만 상속받고 생성자만 적절하게 정의하면 된다