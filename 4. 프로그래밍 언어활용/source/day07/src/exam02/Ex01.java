package exam02;

public class Ex01 { // 숫자를 0으로 나누게 되면 JAVA에서 오류 발생 !
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        int result = num1 / num2;
        System.out.println(result); // 오류 발생 !

        System.out.println("매우 중요한 실행 코드... 반드시 실행 !"); // 위에서 오류 발생하기 때문에 서비스 중단, 중요한 코드 실행 X
        // 예외는 발생한다. 그러나 서비스가 중단되면 안 된다.
        // 따라서 예외를 배우는 이유(목적)는 서비스 중단을 막기 위해서다.

    }
}
