package exam01.practice; // for문에 if문이 중첩되면 읽기 힘들어진다. continue로 중첩을 없애서 코드 가독성을 높이자!

public class Practice04 {
    //구구단을 홀수 단만 출력하도록 프로그램을 만드시오. 구현 소스
    public static void main(String[] args) {
        // 구구단을 홀수 단만 출력하도록 프로그램을 만드시오.
        for (int i = 2; i <= 9; i++) {

            if (i % 2 == 0) {
                continue;
            }

            System.out.println(i + "단 ===========");
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d X %d = %d%n", i, j, i * j);
            }
        }
    }
}
/*
3단 ===========
3 X 1 = 3
3 X 2 = 6
3 X 3 = 9
3 X 4 = 12
3 X 5 = 15
3 X 6 = 18
3 X 7 = 21
3 X 8 = 24
3 X 9 = 27
5단 ===========
5 X 1 = 5
5 X 2 = 10

...

9단 ===========
9 X 1 = 9
9 X 2 = 18
9 X 3 = 27
9 X 4 = 36
9 X 5 = 45
9 X 6 = 54
9 X 7 = 63
9 X 8 = 72
9 X 9 = 81
 */