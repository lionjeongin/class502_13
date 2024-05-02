package exam02;

import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
        /*
        1. 문자열 앞 뒤로 * ...*
        2. 대문자 변환
        3. 출력
         */
        String[] fruits = {"apple", "orange", "mango", "melon"};
        Arrays.stream(fruits).map(s -> "*" + s + "*") // 스트림 객체가 됐다. 보통 변환작업은 map이다. 변환 작업이기 때문에 들어오면 나가는 게 있다.
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}
