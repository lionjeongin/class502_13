package exam02;

public class Ex01 {
    public static void main(String[] args) {
        String s1 = new String("ABC");
        String s2 = new String("ABC");
        System.out.printf("s1 == s2: %s%n", s1 == s2);
        System.out.printf("s1 주소: %d%n", System.identityHashCode(s1));
        System.out.printf("s2 주소: %d%n", System.identityHashCode(s2));
    }
}
/*
결과
s1 == s2: false
s1 주소: 1149319664
s2 주소: 284720968
 */