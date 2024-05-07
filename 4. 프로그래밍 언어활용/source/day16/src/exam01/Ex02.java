package exam01;

import java.util.Random;

public class Ex02 {
    public static void main(String[] args) {
        Random rand = new Random();
        int firstOdd = rand.ints(100)
                .filter(x -> x % 2 == 1) // 걸러주고
                .findFirst() // 찾고
                .orElse(-1); // 반환값
        System.out.println(firstOdd);
    }
}
