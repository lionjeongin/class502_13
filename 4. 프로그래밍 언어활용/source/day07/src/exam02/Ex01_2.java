package exam02;

public class Ex01_2 { // 다중 오류 -> 예외가 두 개 발생해서 catch를 추가 !
    public static void main(String[] args) {
        try {
            int num1 = 10;
            int num2 = 2;
            int result = num1 / num2;  // ArithmeticException

            String str = null;
            System.out.println(str.toUpperCase()); // NullPointerException

            System.out.println(result);
        } catch (ArithmeticException e) {
            e.printStackTrace();

        } catch (Exception e) {
            System.out.println("유입!");
            e.printStackTrace();
        }

        System.out.println("매우 중요한 코드...");


    }
}
/*
-> 결과
매우 중요한 실행 코드... 반드시 실행 !

다형성을 이용하기!
 */