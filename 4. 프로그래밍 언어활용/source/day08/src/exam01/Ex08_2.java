package exam01;

import java.util.Arrays;

public class Ex08_2 {
    public static void main(String[] args) {
        int result1 = sum(10, 20, 30, 40);
        int result2 = sum(10, 20);
        System.out.println(result1);
        System.out.println(result2);
    }

    public static int sum(int... nums) { // ...은 자바 스크립트와 다르게 가변적인 걸 의미한다. 점 세개를 가지고 정의한다.
        int total = 0;
        for (int num : nums) {
            total += num;
        }

        return total;
    }
}
/*
결과
100
30

 */