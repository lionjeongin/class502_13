package exam02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex06 {
    public static void main(String[] args) {
        String str = "java I like java and javascript"; // javascript는 단어와 단어 사이에 공백이 없어서 인식X
        Pattern p1 = Pattern.compile("\\bjava\\b"); // \b 공백 포함 경계선을 의미!
        Matcher m1 = p1.matcher(str);
        if (m1.find()) {
            System.out.println(m1.group()); // 문장의 첫번째 java 매칭
        }

        if (m1.find()) {
            System.out.println(m1.group()); // 문장의 두번째 java 매칭
        }

        if (m1.find()) {
            System.out.println(m1.group()); // javascript는 단어와 단어 사이에 공백이 없어서 인식 X java 매칭 안 돼서 오류 발생
        }
    }
}

/* 결과
java
java
 */