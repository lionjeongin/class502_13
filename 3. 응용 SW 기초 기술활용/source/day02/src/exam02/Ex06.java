package exam02;

import java.util.Arrays;

public class Ex06 {
    public static void main(String[] args) {
        int[][] nums = { {10, 20, 30}, {40, 50, 60} };
        // System.out.println(nums.length); 결과 : 2 -> 행의 갯수가 2다!!
        //System.out.println(nums[0].length); 결과 : 3 -> 열의 갯수 0번째 있는 열의 갯수 -> 10,20,30 : 3개

        // Arrays : 배열의 편의 기능 모음
        System.out.println(nums); // 배열을 출력하면 주소값이 나온다.
        //System.out.println(Arrays.toString(nums)); // 결과 : [[I@3b07d329, [I@41629346]
        // Ex07을 보면 Arrays.toString는 간편하게 배열 안을 보여주는데 여기선 주소를 보여준다
        // 그 이유 ?

        System.out.println(Arrays.deepToString(nums)); // 4차원 배열일 땐 이걸 쓴다!! 간편하게 배열 안에 있는 걸 확인 가능

        /*
        System.out.println(nums.length); // 행의 갯수
        System.out.println(nums[0].length); // 열의 갯수
        System.out.println(nums[1].length); // 열의 갯수

        for (int i = 0; i < nums.length; i++) { // 행
            for (int j = 0; j < nums[i].length; j++) { //
                System.out.println(nums[i][j]); // i행, j열
            }
        }
         */
    }
}

/*  결과
[[I@4eec7777
[[10, 20, 30], [40, 50, 60]]
 */