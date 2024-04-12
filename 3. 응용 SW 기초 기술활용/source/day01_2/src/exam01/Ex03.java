package exam01;

public class Ex03 {
    public static void main(String[] args) {
        char ch1 = 'A'; // 컴퓨터가 A를 인식 못한다. 컴퓨터가 A를 이진수로 바꿔서 숫자로 인식한다. 아스키코드!
        System.out.println(ch1); // A
        System.out.println(ch1 + 1); //66
        System.out.println(ch1 > 'B');

        char ch2 = '가';
        System.out.println(ch2); // 가
        System.out.println(ch2+ 1); // 44033
        System.out.println(ch2); // 강의 때 못 적었다ㅜ
    }
}
