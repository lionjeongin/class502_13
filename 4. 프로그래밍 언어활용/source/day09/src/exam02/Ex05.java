package exam02;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex05 { // [0-9]
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 포함하여 입력: ");
        String str = sc.nextLine();

        Pattern p1 = Pattern.compile("[0-9]"); // 0에서 9까지
        Matcher m1 = p1.matcher(str);
        if (!m1.find()) {
            System.out.println("숫자를 포함하여 입력하세요.");
        }
    }
}
/* 결과 1
숫자를 포함하여 입력: abc
숫자를 포함하여 입력하세요.

결과 2
숫자를 포함하여 입력: abc123

 */
