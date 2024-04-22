package exam11;

public class Outer {
    static class Inner {

        int num1 = 10;
        static int num2 = 20;

        public void method() {
            // 정적인 메서드일 때는 객체가 됐을 때 사용가능한 자원을 호출할 수 없다.
            // Outer 클래스의 인스턴스 자료는 접근 못 함
            System.out.println("정적 내부 클래스에서 호출!");
            // System.out.println(num1); -> Outer 클래스의 객체가 되든 관련 x, 접근 x
            System.out.println(num2);

        }
    }
}
