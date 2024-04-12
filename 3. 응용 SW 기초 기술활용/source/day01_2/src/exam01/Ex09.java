package exam01;

public class Ex09 {
    public static void main(String[] args) {
        long num1 = 1000000000L;
        double num2 = num1; // 정수 -> 실수 : 자동 형변환(묵시적 형변환) - 8byte
        float num3 = num1;  // 실수는 모든 정수를 포함 가능하다. 실수 > 정수 : 실수가 정수보다 크다
        /*
        byte -> short -> int -> long -> float -> double : 자동 형변환
	             char ->
         */
        double num4 = 0.0;
        for (int i = 0; i < 1000; i++) {

            num4 += 0.1;
           }

        System.out.println(num4);  // 결과 : 99.9999999999986 -> 실수는 오차가 날 수 있다.
    }
}
