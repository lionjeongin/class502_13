package exam01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Ex01 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("이름1", "이름2", "이름3","이름4");
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) { // 이름1~2를 여기에 순서대로 넘겨준다.
                System.out.println(s); // 객체가 되는 조건에 의해서 정의하고 메서드를 forEach 구문 아래에서 호출
                // 이 역할 한 가지만 수행 보통은 이런 사용자 정의 기능은 한 줄 로 끝난다.
                // 일회용적인 목적으로 한 번 쓰고 버릴 건데 메서드 정의까지 해야해서 내가 정의한 하나의 역할만
                //수행하는 거면 짧게 이 메서드를 하나의 식으로 표현하자! -> 람다식으로 하자 자바스클립ㅌ츠에서 화살표함수가 나왔던 것이랑 동일하다.
            }
        });
    }
}
