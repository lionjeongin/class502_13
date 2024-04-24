package exam01;

import java.util.Arrays;

public class Ex08 {
    public static void main(String[] args) {
        sum(10, 20, 30, 40);
        sum(10, 20);
    }

    public static int sum(int... nums) { // ...은 자바 스크립트와 다르게 가변적인 걸 의미한다.
        System.out.println(Arrays.toString(nums));

        return 0;
    }
}
/*
결과
[10, 20, 30, 40]
[10, 20]

가변적으로 정의할 수 있는 변수
 */
