package exam01;

public class Ex02 { // 단락회로 평가
    public static void main(String[] args) {
        int num = 10;
        boolean result = num++ > 10 && (num = num + 10) > 15;
        // num++ > 10 의 연산 결과가 false이기 때문에 이미 답이 나와서 연산을 끊어버린다.
        // ++이 num 뒤에 있으니까 num > 10 을 먼저 계산해주고 num++를 그 다음에 연산해서 num의 값은 10이 된다.
        System.out.println(result); //false
        System.out.println(num); // 11

        int num2 = 10;
        boolean result2 = ++num2 > 10 && (num2 = num2 + 10) > 15;
        // num++ > 10 의 연산 결과가 true 이기 때문에 다음 비교연산으로 넘어간다.
        System.out.println(result2); // true
        System.out.println(num2); // 21

        boolean result3 = !result2; // ! : ture -> false 로 바꿔준다.
        System.out.println(result3); // false

    }
}
