package exam02;

public class Ex04 {
    public static void main(String[] args) {
        A ad = new D(); // D라는 객체에서 A라는 객체를 담았다. 출처가 명확하다. 자동으로 형변환

        A ac = new C(); // C라는 큰 객체 안에 B안에 A라는 객체 있다. 출처 명확하다. 자동형변환

        // C c = ad; -> 출처가 다를 수 있기 때문에 자동형변환X
        /*
        C C = (C)ad; -> 강제형변환 : 그럼에도 불구하고 하겠다고 명시적으로 알려줘야한다.
         그래도 오류난다! 그래서 출처를 체크하는 instanceof를 사용해야한다!!
         */
        if (ad instanceof C) {
            C c = (C) ad; // 출처가 B이다.
        }
        if (ac instanceof C) {
            C cc = (C) ac; // 강제형변환 해줘야 한다! 자원의 범위가 늘어남 = 자원의 접근이 가능하다
            System.out.println(cc.numA); //10
            System.out.println(cc.numB); //20
            System.out.println(cc.numC); //30 / numA, numB, numC 다 가능
        }
    }
}
