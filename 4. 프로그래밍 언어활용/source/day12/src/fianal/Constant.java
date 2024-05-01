package fianal;

public class Constant {

    int num = 10;
    final int NUM = 100; // 상수 선언

    public static void main(String[] args) {

        Constant cons = new Constant();
        cons.num = 50;
        //cons.NUM = 200; // 상수에 값을 대입하여 오류 발생

        System.out.println(cons.num);
        System.out.println(cons.NUM);
    }
}
/*
final = **변경 불가/마지막**

쓰이는 위치에 따라서

**변수**가 변경 불가할 때 변수에 붙어있으면 **상수**

메서드가 변경 불가 일 때 **메서드**에 붙어있으면 **재정의 불가**

**클래스**가 변경 불가일 때 붙어있으면 **상속 불가**
 */