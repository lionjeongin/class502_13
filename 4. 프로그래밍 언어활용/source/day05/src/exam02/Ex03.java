package exam02;

public class Ex03 {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c instanceof C); // true
        System.out.println(c instanceof B); // true
        System.out.println(c instanceof A); // true
        // c 라는 객체는 A, B, C로 만든 객체가 포함되어 있다. 그래서 true
        // System.out.println(c instanceof String); -> 오류
    }
}
