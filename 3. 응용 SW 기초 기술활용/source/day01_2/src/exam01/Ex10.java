package exam01;

public class Ex10 {
    public static void main(String[] args) {
        int num1 = 10000000;
        //byte num2 = num1; 큰 컵에 있는 물을 작은 컵에 있는 물에 담을 수 있지만 다 못 담는다.
        // -> 다 못 담아서 데이터가 변질된다.(데이터가 유실된다.) 함부로 안 바꿔준다.
        // 자바가 물어본다. 바꾸겠다고 알려주면 자료가 부족하더라도 담아준다. 그러나 변질된 데이터(유실된 데이터)로 담아준다.
        //
        byte num2 =(byte)num1; // 명시적 형변환 : 그럼에도 불구하고 유실된 데이터가 되더라도 바꾸겠다고 자바에게 알려주는 것
        System.out.println(num2); // 결과 : -128 / 유실된 데이터로 저장되었다.

        int num3 = 100;
        byte num4 = (byte)num3;

        System.out.println(num4); // 결과 : 100
    }
}
