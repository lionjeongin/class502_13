package exam01;

public class Ex07_2 { //교수님 코드 따라보기
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            System.out.println(i + "단 ============");
            for (int j = 1; j <= 9; j++) {
                //System.out.println(i + " X " + j + " = " + (i * j));
                System.out.printf("%d X %d = %d%n", i, j, i * j);
            }
            System.out.println(); // \n
        }
    }
}
/*
2단 ============
2 X 1 = 2
2 X 2 = 4
2 X 3 = 6
2 X 4 = 8
2 X 5 = 10
2 X 6 = 12
2 X 7 = 14
2 X 8 = 16
2 X 9 = 18

3단 ============
3 X 1 = 3
3 X 2 = 6
3 X 3 = 9

...

9단 ============
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