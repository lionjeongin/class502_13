package exam01;

public class Ex07 {
    public static void main(String[] args) {
        //int num1 = 10000000000000; int의 크기보다 넘어서는 숫자라서 오류난다.
        //long num1 = 10000000000000; long의 크기가 10000000000000가 들어가는 크기지만 오류난다.
        // int(4byte) -> 처음에 int를 던졌기 때문에 오류가 난다.
        /*
        자바는 일하기 싫어한다. 개발자가 많이 쓰는 숫자인 int를 많이 쓴다. int -> 가장 효율적인 자료형이다.
        자바는 효율성을 추구하기 때문에 숫자 들어오면 int부터 쓴다 안 맞으면 그때서야 바꿔준다.
        그래서 처음부터 long 범위로 인식하고 int 던지지 않게 하는 것을 l이나 L을 붙여주면 된다.!!
         */
        long num1 = 10000000000000L; // L or l : 처음부터 long으로 인식하게 해준다.

        byte num2 = 100; // 자바에서 정수 보이면 일단 int를 던지고 안 맞으면 byte로 바꿔준다.

        long num3 = 10_000_000_000_000L; // long 값일 때는 숫자가 크기 때문에 _로 숫자 끊어도 된다.

        // 실수 일때는 가장 먼저 double(8byte)로 인식한다!
        // float num4 = 100.123; 오류난다 / 자바에서 실수 보이면 일단 double(8byte)로 들어간다.
        float num4 = 100.123F; // F or f : 처음부터 float(4byte)으로 인식한다.
    }
}
