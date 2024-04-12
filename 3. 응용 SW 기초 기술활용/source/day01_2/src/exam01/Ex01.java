package exam01;

import org.w3c.dom.ls.LSOutput;

public class Ex01 {
    public static void main(String[] args) {
        int num1; // 변수 선언
        num1 = 10; // 초기화 : 최초로 값을 대입하는 것 -> 초기화

        int num2 = 10; // 선언과 동시에 초기화

        num1 = 15;

        System.out.println(num1); // 15
        System.out.println(num2); // 10

        int a = 100; // 변수명을 명확하게 정해야한다. 유의미한 단어 형태로 적기
        int numberOfStudent = 10; // 카멜 표기법 : 단어 사이마다 첫 글자룰 대문자로 적기 / 첫 단어는 소문자로!
        int 학생수 = 20; // 한국어 대신 영어로 적기
    }
}