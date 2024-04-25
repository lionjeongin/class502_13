package exam01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex03 { // 파일쪽에서 데이터를 읽어오기(입력받기)
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("data.txt")); // 엄격한 예외 : 위에서 throws로 예외처리 해주기

        int total = 0;
        while(sc.hasNextInt()) {
            int num = sc.nextInt();
            total += num;
        }
        System.out.println(total);
    }
}
/* 결과
1500
 */