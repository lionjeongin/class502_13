package exam02;

import java.util.Arrays;

public class Ex04 {
    public static void main(String[] args) {
        String[] strs = {"가나", "다라", "마바"};

        for (String str : strs) { // 향상된 for문
            System.out.println(str);
        }

        //Arrays.stream(strs).forEach(System.out::println); -> 나중에 배울 구문! 지금은 위에 향상된 for문으로 사용하자!

        /*
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }

         */
    }
}

/* 결과
가나
다라
마바
 */