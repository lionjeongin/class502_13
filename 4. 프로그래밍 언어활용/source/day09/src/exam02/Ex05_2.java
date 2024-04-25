package exam02;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex05_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자만 입력: ");
        String str = sc.nextLine();

        // Pattern p1 = Pattern.compile("\\d"); // \\d = \d  역슬래시 두번 입력해야 한 개가 제거되고 최종적으로 힌번으로 인식한다.
        //Pattern p1 = Pattern.compile("\\D"); // 숫자가 아닌 문자 \\D = \D
        Pattern p1 = Pattern.compile("[^0-9]"); // [^0-9]" = 숫자가 아닌 문자 / [0-9] = 숫자 포함 문자
        Matcher m1 = p1.matcher(str);
        if (m1.find()) {
            System.out.println("숫자만 입력하세요.");
        }
    }
}
/*
결과 1
숫자만 입력: ab124
숫자만 입력하세요.

결과 2
숫자만 입력: 124
 */