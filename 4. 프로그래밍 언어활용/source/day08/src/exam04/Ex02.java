package exam04;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

// 로또 만들기
public class Ex02 {
    public static void main(String[] args) {
        /* System.out.println(Math.random() * 3);
        0~1 중에 랜덤인 수 * 3 -> 번호 소수점 자리 앞에가 0, 1, 2 만 나온다.
        곱하는 수가 n이면 소수점 앞에 수는 0 ~ n-1 까지 나온다.
        */
        /*
        int num = (int)(Math.random() * 43); // 0 ~ 42 // (int)로 정수로만 뽑기
        = int num = (int)(Math.ceil(Math.random() * 43);
         */

        // 1 ~ 43, 6개의 숫자 - 중복 X
        int cnt = 0;
        int[] lotto = new int[6];

        while(cnt < 6) {
            int num = getNumber();
            if (chkDuplicated(lotto, num)) {
                continue;
            }

            lotto[cnt] = num;
            cnt++;
        }

        System.out.println(Arrays.toString(lotto));
    }

    public static int getNumber() {
        return (int)(Math.random() * 43) + 1;
    }

    public static boolean chkDuplicated(int[] lotto, int num) {

        for (int n : lotto) {;

            if (n == num)
                return true;
        }

        return false;
    }
}
/* 결과 - 무작위 수 6개
[43, 1, 34, 8, 38, 31]
 */
