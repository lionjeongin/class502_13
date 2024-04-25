package exam01;

import java.util.Scanner;

public class Ex02 { // 이름 입력받기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 터미널에서 입력
        System.out.print("이름을 입력하세요:");
        String name = sc.nextLine(); // 입력 받을 때까지 커서가 깜빡거린다.
        System.out.printf("이름:%s%n", name);
    }
}
/* 결과
이름을 입력하세요:이이름    // 이이름을 입력하면 다음줄에 이렇게 나온다.
이름:이이름
 */
