package exam01;

public class Ex11 {
    public static void main(String[] args) {
        double num1 = 10.123;
        //long num2 = num1; // JAVA : 소수점이 날아가도 괜찮겠냐 ? ME : 응, 해줘(명시적 형변환)
        long num2 = (long)num1; // 결과 : 10
        System.out.println(num2);
    }
}
