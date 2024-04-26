package exam04;

public class LoginService { // 사용자 정의 예외
    public void login(String userId, String userPw) throws UserIdException, UserPwException { // 아이디와 비번을 입력받을 수 있는 메서드를 호출, 메서드로 로그인, 매개변수로 아이디와 로그인
        // throws 로 전가시킬 예외를 명시
        // userId - user01, userPw = 123456 // 아이디와 비번 고정
        try { // 비번과 예외가 다를 때 던지기
            if (!userId.equals("user01")) { // 아이디가 user01과 일치하지 않을 때
                throw new UserIdException("아이디가 일치하지 않습니다."); // throw로 예외를 생성하기! 던지면 예외가 발생
            }

            if (!userPw.equals("123456")) {// 비밀번호가 123456과 일치하지 않을 때
                throw new UserPwException("비밀번호가 일치하지 않습니다.");
            }

            System.out.println("로그인 성공!");

        } catch (UserIdException | UserPwException e) {
            System.out.println(e.getMessage()); // 위에 try 메세지 :아이디가 일치하지 않습니다, 비밀번호 일치하지 않습니다 메세지가 여기 유입된다.
        }
    }
}
/*
UserPwException을 보면 Exception의 바로 하위 클래스기 때문에
엄격한 예외라서 예외가 발생하지 않더라도 무조건 예외처리 해야한다. try-catch로 해주기!
 */