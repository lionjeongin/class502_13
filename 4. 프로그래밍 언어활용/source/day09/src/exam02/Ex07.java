package exam02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex07 {
    public static void main(String[] args) {
        String str = "java one\njava two\njava three";
        /*Pattern p1 = Pattern.compile("^\\w+\\s");
         줄개행 문자가 있더라도 하나의 문장으로 생각한다.
        따라서 하나의 문장이 아니라 여러개의 문장이라고 인식하게 만들어주어야 한다.
        -> Pattern.MULTILINE 쓰기
         */
        Pattern p1 = Pattern.compile("^\\w+\\s", Pattern.MULTILINE);
        Matcher m1 = p1.matcher(str);
        if (m1.find()) {
            System.out.println(m1.group());
        }
        if (m1.find()) {
            System.out.println(m1.group());
        }
        if (m1.find()) {
            System.out.println(m1.group());
        }
        //System.out.println(str);

    }
}
/* 결과
java   -> java 뒤에 공백 하나까지 포함
java   -> java 뒤에 공백 하나까지 포함
java   -> java 뒤에 공백 하나까지 포함
 */

