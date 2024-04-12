package exam01;

public class Ex12 {
    public static void main(String[] args) {
        int num1 = 13;
        double num2 = 3.6;

        // 곱셈 결과를 정수로 표현 -> 4/17일 시험!!

        // int num3 = num1 * (int)num2; //3.6 -> 3   13 *3=39 나온다.
        int num3 = (int)(num1 * num2);
        System.out.println(num3);

    }
}
