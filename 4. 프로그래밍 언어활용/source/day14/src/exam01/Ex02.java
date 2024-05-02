package exam01;

import java.util.function.BiFunction;

public class Ex02 {
    public static void main(String[] args) { // 두 수를 더할 수 있는 람다식 지네릭은 배열과 참조자료형밖에 안되서 기본 자료형은 못 씀
        BiFunction<Integer, Integer, Integer> calc = (a, b) -> a + b; //매개변수 두개짜리 반환값 형태
        int result = calc.apply(10, 20);
        System.out.println(result);
    }
}
 /* 마음속으로 뭔가 불편함
// 지금 두 수를 더하는 연산이다. 그건 기본 자료형만 되는데 얘는 객체다. 연산하기 위해 int value가 자동 호출되서 언박싱 발생
 반환 값을 int 했으면 다시 감싸줘서 오토박싱되고 다시 꺼내서 언박싱 발생 = 총 3개의 불필요한 작업이 나옴

 1. 연산을 위해서 Integer -> int (언박싱), 반환값 Integer로 변환(오토 박싱), int result로 변환 -> (언박싱) -> 성능저하
 따라서 연산은 그냥 기본형으로 하는ㄱ ㅔ좋다. 매퍼 클래스(기본 자료형을 감싸는 기능=기본형의 기능을 주기 위해서)로 하면 꺼내고 다시 감싸는 작업을 자동으로 하기 때문에 성능 저하가 온다. 연산은 그냥 기본형으로 하자!!
 2. Integer, Integer, Integer.... 자료가 너무 반복된다.
  */
