package exam03;

public class Ex05 {
    public static void main(String[] args) {
        int num1 = 100;
        Integer num2 = Integer.valueOf(200); // 객체끼린 연산 안 된다.

        int result1 = num1 + num2; // num2 => num2.intValue()가 자동으로 발생한다.
        System.out.println(result1);

        Integer num3 = Integer.valueOf(100);
        Integer num4 = Integer.valueOf(200);

        int result2 = num3 + num4;
        System.out.println(result2);

    }
}
/*
결과
300
300

-> 원래 객체끼린 연산 안 되는데 컴파일러가 바꿔준다. 객체 자체는 연산이 안 되서
자동으로 추가해준다.
 */
