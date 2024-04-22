package exam10;

public class Outer {

    int num1 = 10;

    class Inner { // 인스턴스 내부 클래스  -> Inner는 Outer가 있어야지만 정의된다. 따라서 static 안 됨!! 정적인 자원 안 됨!! 그러나!! 자바 16버전 이후부터는 오류 x
        int num1 = 15;
        int num2 = 20;
        static int num3 = 30; // -> 정적인 자원 원래 안됐는데 자바 16버전 이후부터는 오류 x : 교재는 11버전이라 교재대로 하면 오류!! -> 나중에 블로그에 올리쟈~~

        public void method() {
            System.out.println("인스턴스 내부 클래스에서 호출");
            System.out.printf("num1 + num2 = %d%n", Outer.this.num1 + num2); //Outer.this.num1은 정적변수라서 10을 가리킨다. 지역변수 15 아니다!
            // Outer.this -> 외부 클래스의 있는 자원을 접근

        }
    }
}
