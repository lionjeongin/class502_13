package exam03;

public class Ex02 {
    public static void main(String[] args) {
        Integer num1 = new Integer(10);
        Integer num2 = new Integer(10);
        System.out.printf("num1 주소 : %d%n", System.identityHashCode(num1));
        System.out.printf("num2 주소 : %d%n", System.identityHashCode(num2));
    }
}
/* 결과
num1 주소 : 1324119927
num2 주소 : 284720968

재료가 10으로 동일하니 결과도 동일하다. 하지만 객체는 새로 만들 수 있다. 자원낭비가 발생할 수 있어서
어떤 메서드를 호출하든 간에 재료가 동일하니까 결과가 같다.
기능이 재료가 동일한데 처리되는 내용이 같으니까 굳이 객체를 여러개 만들 필요가 없다는 것이다.
그래서 자바 버전 점프하면서 바꼈다 -> 자원 낭비 때문에 Integer말고 valueOf로 쓰기!! -> EX03
 */