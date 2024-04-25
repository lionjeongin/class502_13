package exam02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex08 {
    public static void main(String[] args) {
        //String str = "AAA 1234 BBBB 456"; // .점은 공백도 포함하기 때문에 결과에 AAA도 포함된다.
        //String str = "AAA\n1234\nBBBB\n456"; // . 점은 줄개행은 포함하지 않는다.
        String str = "AAA\n1234\nBBBB\n456\nCCCCC\nDDDDDDD"; // . 점은 줄개행은 포함하지 않는다.
        // 4글자로 구성된 단어를 찾기
        // Pattern p1 = Pattern.compile("\\b....\\b"); // .점 하나가 문자 한 개
        //Pattern p1 = Pattern.compile("\\b.{4}\\b"); // 점이 4개 있다는 뜻, 앞에 있는 문자의 반복 횟수가 중괄호 안에 넣어져 있다.
        //Pattern p1 = Pattern.compile("\\b.{4,}\\b"); // 4글자 이상
        //Pattern p1 = Pattern.compile("\\b.{4,5}\\b"); // 4글자 이상, 5글자 이하
        Pattern p1 = Pattern.compile("\\b.{1,4}\\b"); // {,4} : 4글자 이하 -> java에서는 인식 못해서 {1,4} 이렇게 쓰기!
        Matcher m1 = p1.matcher(str);
        /*
        if (m1.find()) {
            System.out.println(m1.group());
        }

        if (m1.find()) {
            System.out.println(m1.group());
        }
         */
        while(m1.find()) {
            System.out.println(m1.group()); // 패턴 조건에 맞는 건 전부 다 가져오기
        }
    }
}
/*
1234
BBBB
CCCCC
 */
