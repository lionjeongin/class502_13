package exam10;

public class Ex01 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.method();
        System.out.println(Outer.Inner.num3); // 정적인 자원 -> 자바 16버전 이후부터는 오류 x
    }
}
