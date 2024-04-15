package exam01.practice;

public class Practice05 {
    //구구단을 단보다 곱하는 수가 크거나 같은 경우만 출력하는 프로그램을 만들어 보세요.구현 소스
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            System.out.println(i + "단 ===========");
            for (int j = 1; j <= 9; j++) {
                //if (i <= j) {
                if (i > j) {
                    continue;
                }
                System.out.printf("%d X %d = %d%n", i, j, i * j);
                //}
            }
        }

/*
2단 ===========
2 X 2 = 4
2 X 3 = 6
2 X 4 = 8
2 X 5 = 10
2 X 6 = 12
2 X 7 = 14
2 X 8 = 16
2 X 9 = 18
3단 ===========
3 X 3 = 9
3 X 4 = 12
3 X 5 = 15

...
8단 ===========
8 X 8 = 64
8 X 9 = 72
9단 ===========
9 X 9 = 81
*/
    }
}
