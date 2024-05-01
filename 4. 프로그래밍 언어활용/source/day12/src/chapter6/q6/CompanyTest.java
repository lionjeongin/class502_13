package chapter6.q6;

public class CompanyTest {

    public static void main(String[] args) {  // 4. 실제로 사용하는 코드 만들기

        Company myCompany1 = Company.getInstance();
        Company myCompany2 = Company.getInstance(); // 4_2. 클래스 이름으로 getInstance() 호출하여 참조 변수에 대입

        System.out.println( myCompany1 == myCompany2 ); // 4_3. 두 변수가 같은 주소인지 확인
    }
}
