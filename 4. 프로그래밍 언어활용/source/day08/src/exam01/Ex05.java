package exam01;

import java.util.HashSet;

public class Ex05 {
    public static void main(String[] args) {
        HashSet<String> data = new HashSet<>();
        data.add("AAA");
        data.add("BBB");
        data.add("AAA"); // 중복 배제
        data.add("CCC");
        System.out.println(data);
    }
}
/*
결과
[AAA, CCC, BBB]
-> 중복을 제거(배제)하면서 값이 들어가있다.
-> hashCode가 동일하다.
 */
