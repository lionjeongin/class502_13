package exam02;

public class Ex03 {
    public static void main(String[] args) {
        //int[] nums = new int[] {10, 20, 30, 40}; JAVA는 똑똑해서 앞에만 봐도 배열인 줄 안다!
        int[] nums = { 10, 20, 30, 40}; // 선언과 동시에 초기화 : 배열인 걸 충분히 알아서 new int[] 생략 가능!

         /*
         int[] nums;
         nums = {10,20,30,40}; 분리해서 쓰는 경우에는 오류난다! 반드시 new int 써줘야 한다!!
         앞에 선언 변수와 직접 대입하는 배열을 분리해서 쓸 때는 new int를 써줘야하지만
         선언과 동시에 초기화 할 때엔 짧게 써서 new int를 생략가능하다.
          */

        for (int i = 0; i <= 3; i++) {
            System.out.println(nums[i]);
        }
        /*
        10
        20
        30
        40
         */
    }
}
