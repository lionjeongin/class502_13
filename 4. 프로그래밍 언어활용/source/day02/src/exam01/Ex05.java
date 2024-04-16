package exam01;

import java.lang.reflect.Method;

public class Ex05 {
    public static void main(String[] args) {
        Class cls = Student.class;

        Method[] methods = cls.getMethods();
        for (Method method : methods) {
            System.out.println(method); // 클래스의 정보가 담겨져 있는 객체
            // 생성자 : 객체를 생성하는 메서드
        }
    }
}