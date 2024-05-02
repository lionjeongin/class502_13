package exam02;

import java.util.Arrays;
import java.util.function.IntUnaryOperator;

public class Ex07 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        /*int[] nums2 = map(nums, new IntUnaryOperator() {
            @Override
            public int applyAsInt(int operand) {
                return num * num * num;
            }
        });

         */
        int[] nums2 = map(nums, x -> x * x); // 위에 과정을

        System.out.println(Arrays.toString(nums2));
    }

    public static int[] map(int[] nums, IntUnaryOperator oper) { //IntUnaryOperator=인터페이스 -> 추상메서드로 정의되어 있음
        int[] newNums = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            newNums[i] = oper.applyAsInt(nums[i]);
        }

        return newNums;
    }
}
// 함수형 인터페이스 -> 목적이 특수하게 정해져 있다. 역할은 주로 매개변수 : 사용자 정의 기능
// applyAsInt 내부에서 반복하면서 값(재료)만 준다. 내부에 반복하면서 nums[i]라는 재료만 넘겨준다.
// 가공은 내가 해야됨 얘는 단순히 호출만 한다.
