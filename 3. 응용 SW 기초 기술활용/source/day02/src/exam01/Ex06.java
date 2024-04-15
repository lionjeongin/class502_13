package exam01;

public class Ex06 {
    public static void main(String[] args) {
        //(1)
        int total = 0;
        for (int i =0; i <= 100; i++) { // 순서에 대한 의미 index에서 i를 따와서 관례적으로 초기화식 변수명 i 부터 시작 -> i, j, k, l ....
            total += i;
        }

        System.out.println("합계: " + total);
        // 결과 : 합계: 5050

        //(2)
        int total2 = 0;
        for (int j =0, k=10; j <= 100; j++, k += 2) { // 초기화식, 증감식, 조건식 다양하게 여러개 쓸 수 있다.
            total2 += j;
            System.out.println("k:"+ k);
        }

        System.out.println("합계: " + total2);

        //결과
        //k:10
        //k:11
        // ...
        //k: 210
        //합계: 5050


        //(3)
        int total3 = 0;
        int l = 0, m = 10; // 구성요소를 따로 빼서 쓰기 가능하다.
        for (; ; l++, m +=2) {
            if (l > 100) {
                break; // 반복 건너뛰기 continue!! 현재 반복을 중단, 새로 시작
            }

            total3 += l;
            System.out.println("m" + m);
        }
        // for ( ; ; ) {  }  ==  while(true) { ... }

        //결과
        //m:10
        //m:11
        // ...
        //m: 210

    }
}
