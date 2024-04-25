package exam02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex01 { // pattern 클래스
    public static void main(String[] args) {
        String str = "I like java and javascript";

        Pattern p1 = Pattern.compile("java.*");
        Matcher m1 = p1.matcher(str); // 다형성으로 문제 없다.

        System.out.println(m1.find()); // true java에서 java 찾기
        System.out.println(m1.group()); // java   패턴에 일치하는 문자열

        System.out.println(m1.find()); // true javascript에서 java 찾기
        System.out.println(m1.group()); // java
        // 패턴에 일치하는 문자열 왜 javascirpt가 아닌 걸로 나오나?
        // 10번줄 뒤를 java로만 넣어주었기 때문에 java만 찾는다.따라서 java.*로 넣어주어야 java 포함 문자열이 나온다.

        System.out.println(m1.find()); // false 이동하면서 더이상 java가 없어서 false
        System.out.println(m1.group()); // java   패턴에 일치하는 문자열이 없어서 오류 발생
        // -> 반복문으로 많이 쓰인다!

    }
}
