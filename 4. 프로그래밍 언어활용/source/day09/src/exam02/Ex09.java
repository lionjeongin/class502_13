package exam02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex09 { // 휴대폰 번호 검증(한국 버전으로)
    public static void main(String[] args) {
        String mobile = "010-3481-2101";
        System.out.println(checkMobile(mobile));

    }
    public static boolean checkMobile(String mobile) {
        /**
         * 010-0000-0000
         * 011-000-0000
         * 016-000-0000
         */

        //Pattern pattern = Pattern.compile("01[016]-\\d{3,4}-\\d{4}");
        // 1234010-3481-2101abc1234"여도 010-3481-2101이 포함되어 있기 때문에 ture 나온다.
        //Pattern pattern = Pattern.compile("^01[016]-\\d{3,4}-\\d{4}$");
        // ^ : 시작하는 패턴, $ : 끝내는 패턴
        // 어떤 사람은 - 안쓰고 01034812101 이렇게나 010.3481.2101 이렇게 쓰는 사람이 있다!
        Pattern pattern = Pattern.compile("^01[016]\\D*\\d{3,4}\\D*\\d{4}$");

        Matcher matcher = pattern.matcher(mobile);

        boolean matched = matcher.find();
        return matched;
    }
}
/* 결과
true
 */