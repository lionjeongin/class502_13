package exam04;

import static java.lang.Math.*; // 이걸 넣으면 밑에 Math 지워도 된다.

public class Ex01 {
    public static void main(String[] args) {
        System.out.println(Math.abs(-10)); // 10 절댓값
        System.out.println(Math.ceil(10.2)); // 11 올림
        System.out.println(Math.floor(10.2)); // 10 버림
        System.out.println(Math.round(10.5)); // 11 반올림
        // 위에 import static java.lang.Math.*; // 이걸 넣으면 Math 지워도 된다.
        System.out.println(pow(2, 4)); // 2의 4승
        System.out.println(sqrt(9)); // 3

    }
}
/* 결과
10
11.0
10.0
11
16.0
3.0

 */