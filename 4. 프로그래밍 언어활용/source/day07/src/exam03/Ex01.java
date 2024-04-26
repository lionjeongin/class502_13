package exam03;

public class Ex01 {
    public static void main(String[] args) throws Exception {
        Resources res = new Resources();
        Resources2 res2 = new Resources2();
        try(res; res2) {
            // res가 AutoClosable 인터페이스 구현 객체인지 체크 -> 맞으면 close() 메서드 자동 호출

            // 자동 해제 과정
            //AutoCloseable auto = res; // 형변환된다.
            // 이게 안 되면 오류발생 한 가지 객체만 투입되는 게 아니라서 AutoCloseable 구현 객체로 자동 형변환 해준다.
            //auto.close(); // 내부에서 close 호출

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
/* 결과
자원해제!!

try-with-resources문이 자동적으로 AutoCloseable 구현 객체이면 close 메서드를 자동호출한다.
AutoCloseable 인터페이스 구현 객체가 아니면 호출 안 해준다!!
AutoCloseable : 자원해제가 필요한 거의 모든 클래스는 이걸 가지고 있다

try-with-resources문을 왜 쓴다?? 기존 방식이 복잡해서! 보통 final에 자원해제 하니까!
 */