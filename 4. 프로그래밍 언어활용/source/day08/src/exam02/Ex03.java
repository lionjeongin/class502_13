package exam02;

public class Ex03 {
    public static void main(String[] args) {
        String str = "ABC";
        System.out.printf("str 주소: %d%n", System.identityHashCode(str));

        str += "DEF";
        System.out.printf("str 주소: %d%n", System.identityHashCode(str));

        str += "DEF";
        System.out.printf("str 주소: %d%n", System.identityHashCode(str));

        str += "GHI";
        System.out.printf("str 주소: %d%n", System.identityHashCode(str));


    }
}
/*
str 주소: 1324119927
str 주소: 1922154895
str 주소: 883049899
str 주소: 2093176254

주소가 왜 바꼈을까?

 */