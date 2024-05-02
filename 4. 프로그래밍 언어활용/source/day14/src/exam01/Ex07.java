package exam01;

import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public class Ex07 {
    public static void main(String[] args) {
        ToIntFunction<String> func1 = s -> s.length(); //s가 스트링인 거 충분히 알고 로직이 간단 할 때는 클래스명::length 하면 동일하다.
        ToIntFunction<String> func2 = String::length;

        BiPredicate<String, String> cond1 = (s1, s2) -> s1.equals(s2);
        BiPredicate<String, String> cond2 = String::equals; // 메서드 참조 즉, 매개변수가 정해져 있고 로직이 간단하면 이렇게! 다만 이 순서가 바뀌면 안된다. s1-> s2로 해야한다. 바뀌면 정의해야됨!
    }
}
