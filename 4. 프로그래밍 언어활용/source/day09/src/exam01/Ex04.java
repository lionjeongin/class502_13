package exam01;

import java.util.StringTokenizer;

public class Ex04 {
    public static void main(String[] args) {
        String fruits = "Apple#Orange,Melo_Banana+Mango";  // # 이외에 토큰이 여러개.
        StringTokenizer st = new StringTokenizer(fruits, "#,_+"); // 토큰이 많을 때는 나열하듯이 입력하기
        while(st.hasMoreElements()) {
            String fruit = st.nextToken();
            System.out.println(fruit);
        }
    }
}
/* 결과
Apple
Orange
Melon
Banana
Mango
 */