package exam02;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex04 { // [abc] , [a-z], Pattern.CASE_INSENSITIVE 활용
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문장을 입력하세요:");
        String str = sc.nextLine();

        //Pattern p1 = Pattern.compile("[a-zA-Z]");
        // [a-zA-Z] = a부터 z까지 + A부터 Z까지 : 대소문자 다
        Pattern p1 = Pattern.compile("[a-z]", Pattern.CASE_INSENSITIVE);
        // 알파벳 대소문자 구분 없이 체크(flag) - Pattern.CASE_INSENSITIVE
        Matcher m1 = p1.matcher(str);
        if (!m1.find()) {
            System.out.println("알파벳이 포함되지 않았습니다.");
        }
    }
}
/* 결과1
문장을 입력하세요:12345
알파벳이 포함되지 않았습니다.

결과 2
문장을 입력하세요:123abc456

결과 3
문장을 입력하세요:123ABC456

결과 3
문장을 입력하세요:123ABCabc456
 */
