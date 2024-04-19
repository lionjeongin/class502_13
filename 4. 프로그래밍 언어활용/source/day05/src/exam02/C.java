package exam02;

public class C extends B{
    int numC = 30;

    public C() {
        super(); // this와 동일하다. 따로 정의하지 않아도 컴파일러가 기본적으로 추가한다.
        // B 클래스에 정의된 B()

        System.out.println("C 생성자!");
        // C() → super() : B() → super(): A()
    }
}
