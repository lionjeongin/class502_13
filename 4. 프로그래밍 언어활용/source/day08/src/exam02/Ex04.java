package exam02;

public class Ex04 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(100);
        sb.append("ABC");
        System.out.printf("sb 주소: %d%n", System.identityHashCode(sb));

        sb.append("DEF");
        System.out.printf("sb 주소: %d%n", System.identityHashCode(sb));

        sb.append("GHI");
        System.out.printf("sb 주소: %d%n", System.identityHashCode(sb));

        String str = sb.toString();
        System.out.printf("str 주소: %d%n", System.identityHashCode(str));
        System.out.println(str);
    }
}
/*
결과
sb 주소: 1324119927
sb 주소: 1324119927
sb 주소: 1324119927
str 주소: 284720968
ABCDEFGHI
 */