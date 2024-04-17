package exam01.practice;

public class Re01 {
    //변수 두 개를 선언해서 20과 3.0을 대입하고 두 변수의 사칙연산 결과를 정수로 출력해 보시오
    public static void main(String[] args) {
        int num1 = 20;
        double num2 = 3.0;

        int result = (int)(num1+num2); // int num1 -> double : 연산은 같은 자료형일 때 가능하다.
        // int result = num1+(int)num2; int를 저렇게 쓰면 만약 num2가 3.4일 때 3이 돼서 오차범위 발생한다.

        System.out.println(result); // 23

    }
}
