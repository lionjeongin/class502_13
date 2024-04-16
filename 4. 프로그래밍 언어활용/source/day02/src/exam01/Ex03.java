package exam01;

public class Ex03 {
    public static void main(String[] args) {
        Student s1 = new Student(100, "이이름", "자바");
        s1.study();

        Student s2 = new Student(1001, "김이름", "리액트");
        s2.study();
        //System.out.println(System.identityHashCode(s1)); // 가상의 주소, 객체 주소이다.


    }
}
/* 결과
990368553
 */