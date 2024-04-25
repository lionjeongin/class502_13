package exam01;

import java.util.Random;

public class Ex01 {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 6; i++) {
            int num = rand.nextInt();
            System.out.println(num);
            boolean bool = rand.nextBoolean();
            System.out.println(bool);
        }
    }
}
/*
931696616  // 무작위 수
true
650389957
false
963733769
true
1376656139
false
-273561082
false
-798693610
false

 */