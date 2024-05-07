package exam01;

import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
        int[] scores = { 67, 80, 100, 98, 76, 56};

        int total = Arrays.stream(scores).reduce(0, (n1, n2) -> {
            System.out.printf("n1=%d, n2=%d%n", n1, n2);
            n1 += n2;
            return n1;
            });
        System.out.println(total);
    }
}
/*
n1=0, n2=67
n1=67, n2=80
n1=147, n2=100
n1=247, n2=98
n1=345, n2=76
n1=421, n2=56
477
 */
