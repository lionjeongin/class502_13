package exam02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex02 {
    public static void main(String[] args) {
        String str = "I like java and javascript";

        Pattern p1 = Pattern.compile("java");
        Matcher m1 = p1.matcher(str); // 다형성으로 문제 없다.
        boolean match = m1.matches();
        System.out.println(match); // false
        // -> 패턴(java)가 처음부터 나오고, 패턴이 한가지만 나와야한다.
        // 예를 들어 "java I love you" 처럼!!
        // 정확해야 패턴이 일치해야 true가 나온다!!
    }
}
