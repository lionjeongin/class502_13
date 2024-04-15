package exam01;

public class Ex03 { //삼항 조건 연산자(조건 연산자)
    public static void main(String[] args) {
        int num = 10;

        String str = num % 2 == 0 ? "짝수" : "홀수";
        System.out.println(str); // 짝수

        int num2 = 9;

        String str2 = num2 % 2 == 0 ? "짝수" : "홀수";
        System.out.println(str2); // 홀수
    }
}
