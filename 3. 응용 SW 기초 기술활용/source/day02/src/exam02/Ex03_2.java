package exam02;

public class Ex03_2 { //length : 공간의 갯수
    public static void main(String[] args) {
        // int[] nums = new int[] {10, 20, 30, 40}; // 0, 1, 2, 3

        //int[] nums;
        //nums = new int[] { 10, 20, 30, 40 };
        //nums = { 10, 20, 30, 40 }; // 오류

        int[] nums = { 10, 20, 30, 40 }; // 선언과 동시에 초기화
        System.out.println("공간의 갯수 : " + nums.length);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        // 공간의 갯수 : nums.length -> 이 속성을 이용하면 조건식에 i <=5(배열 요소 갯수-1) 굳이 세서 할 필요 없이 편하다!!
        // 개발자의 관례 : nums.length을 쓸 땐 <=을 쓰지 않고 < 를 쓴다!!
    }
}
/* 결과
공간의 갯수 : 4
10
20
30
40
 */