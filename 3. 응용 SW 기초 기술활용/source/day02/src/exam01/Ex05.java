package exam01;

public class Ex05 {
    public static void main(String[] args) {
        //int total = 0;
        //int num = 0;
        int total = 0, num = 0; // 초기값

        while(num <= 100) { // 조건식 - 반복을 멈추는 조건
            total += num; // total = total + num;
            num++; // num = num + 1 // 증감식
        }

        System.out.println("합계 :" + total); // 문자열 결합 : + 연산자 사용!
    }
}
// 횟수가 정해져 있는 반복문은 초기값, 조건식, 증감식이 꼭 필요하다!!

// 결과
// 합계 :5050