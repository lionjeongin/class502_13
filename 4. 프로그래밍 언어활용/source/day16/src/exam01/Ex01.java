package exam01;

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 7, 9, 11, 13, 14};
        boolean isOdd = Arrays.stream(nums).allMatch(x -> x % 2 == 1);
        System.out.println(isOdd); // false : 짝수가 포함되어 있으니까!

        boolean isEven = Arrays.stream(nums).anyMatch(x -> x % 2 == 0);
        System.out.println(isEven); // True : 조건이 하나라도 참이면 참

        boolean notIncludedEven = Arrays.stream(nums).noneMatch(x -> x % 2 == 0);
        System.out.println(notIncludedEven); // false : 한개라도 짝수가 포함될 때
    }
} // 편의기능을 기억하면 for문을 안 돌려도 된다!
