package exam01;

public class Ex08 {
    public static void main(String[] args) {
        byte num1 = 100; // int -> byte

        int num2 = num1; // byte -> int 작은 자료형에서 큰 자료형으로 갈 때는 공간이 충분해서 가능하다. 자료형이 바뀐다 : 형변환

        long num3 = num2; // int -> long 자료형이 자동으로 바뀐다. : 자동 형변환(묵시적 형변환)
    }
}
