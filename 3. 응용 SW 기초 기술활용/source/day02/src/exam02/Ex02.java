package exam02;

public class Ex02 {
    public static void main(String[] args) {
        int[] nums = new int[4]; // int 변수를 4개 생성, 순차자료구조 구현
        // nums[0], nums1[1], nums[2], nums[3]
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;

        for (int i = 0; i <= 3; i++) {
            System.out.println(nums[i]); // 0번째, 1번째, 2번째, 3번째
        }// nums[3]은 선언만 하고 값을 넣어주지 않았지만 기본 값이 있기 때문에 0이 나온다.
        /* 결과
        10
        20
        30
        0
         */

        /*
        System.out.println(nums[0]); // 10
        System.out.println(nums[1]); // 20
        System.out.println(nums[2]); // 30
         */
    }
}
