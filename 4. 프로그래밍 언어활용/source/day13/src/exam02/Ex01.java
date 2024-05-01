package exam02;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Ex01 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("이름1", "이름2", "이름3", "이름4", "이름5");
        /*names.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        }); //-> 이걸 한 문장으로 쓰기 가능,,,
         */
        names.forEach(s -> System.out.println(s));
        /* 자바에서는 함수가 함수이다. 자바스크립트와 달리 객체가 아니다 값으로 쓰일 수 없다. 함수는 값이 아니다. 그냥 절차가 있는 실행 코드이다.
        자바의 함수만 가지고 함수형 프로그래밍 불가 값으로 쓸 수 없기 때문에 인터페이스가 객체가 되는  조건을 이용해서 만든다.
        따라서 함수형 프로그래밍의 가장 중요한 조건은 값으로 쓸 수 있어야한다! 인터페이스가 객체가 되는  조건에 의해서(값을 쓸 수 있다) 사용자 정의된다.
        함수형 프로그래밍일 때 함수가 매개변수 일 때는 사용자 정의 기능이다.

        용도가 매우 제한적으로 특수한 상황이고 하나의 기능만 수행할 때 짧게 식으로 표현하는 걸 람다식이라고 한다.
        일회용으로 필요할 때 쓰고 버린다. 메서드를 하나의 식으로 쓰는 걸 람다식이라고 한다.
        */
    }
}
