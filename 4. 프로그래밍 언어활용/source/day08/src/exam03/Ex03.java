package exam03;

public class Ex03 {
    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(10);
        Integer num2 = Integer.valueOf(10); // 만약 num1, num2의 i 값이 둘 다 10이 아니라 10000으로 숫자가 커지면 주소가 달라진다.
        System.out.printf("num1 주소 : %d%n", System.identityHashCode(num1));
        System.out.printf("num2 주소 : %d%n", System.identityHashCode(num2));
    }
}
/* 결과
num1 주소 : 1324119927
num2 주소 : 1324119927
 */
