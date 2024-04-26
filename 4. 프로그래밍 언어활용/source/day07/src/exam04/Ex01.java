package exam04;

public class Ex01 {
    public static void main(String[] args) {
        LoginService service = new LoginService(); // 로그인 서비스 만들기
        try {
            service.login("user02", "123456"); // 아이디가 다르게 지정
        } catch (UserIdException | UserPwException e) {
            System.out.println(e.getMessage());
        }
    }
}
/*결과
아이디가 일치하지 않습니다.


호출한 쪽에서 예외처리하기!! = 예외 전가
 */