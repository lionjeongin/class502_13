package exam02;
// 람다를 할 때 함수형 프로그래밍이 나와야한다! / 람다식은 최대한 짧게! 사용하는 경우는 거의다 매개변수 사용자 정의함수, 단순히 빠르게 체크할 때만 사용한다.
public class Ex02 {
    public static void main(String[] args) {
        /*
        Calculator cal = new Calculator() {
            @Override
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        };
         */
        int c = 10;
        Calculator cal = (a, b) -> {
            // c= 20; 오류발생 상수화 되었다.
            return a + b + c;
        }; // 코드 라인이 한 줄 넘어가면 반드시 중괄호 정리가 필요하다.

        int result = cal.add(10, 20);
        System.out.println(result);

    }; // 람다식 이용해서 짧게 쓰기 / 용도가 제한적이기 때문에 짧게 쓴다.

}
