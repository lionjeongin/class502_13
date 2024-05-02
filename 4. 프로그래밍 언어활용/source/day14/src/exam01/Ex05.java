package exam01;

import java.util.function.Function;

public class Ex05 {
    public static void main(String[] args) {
        Function<String, Integer> func1 = s -> s.length();
        Function<Integer, Integer> func2 = x -> x * x;
        Function<String, Integer> func3 = func1.andThen(func2); // func1과 func2는 두 가지 기능이 있다.
        //func3에 func1 길이을 먼저 작업하고 func2를 하고 제곱한다. 그래서 결합해서 새로운 걸 만들었다. 이걸 함수의 결합이라고 한다.
        Function<String, Integer> func4 = func4 = func2.compose(func1); // func1 -> func2

        int num = func3.apply("가나다"); // 가나다 -> 3 -> 9 / 결과 : 9
        //int num = func4.apply("가나다"); // 결과 : 9
        System.out.println(num);

        //int len = func1.apply("가나다");
        //System.out.println(len); // 결과 : 3
    }
}
/*
9
 */