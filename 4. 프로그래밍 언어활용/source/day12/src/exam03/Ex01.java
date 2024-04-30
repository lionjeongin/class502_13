package exam03;

public class Ex01 {
    public static void main(String[] args) {
        StarBucks starBucks = new StarBucks();
        CoffeeBean coffeeBean = new CoffeeBean();

        Person kim = new Person("김씨", 10000);
        Person lee = new Person("이씨", 15000);

        kim.setMenu("아메리카노");
        lee.setMenu("라떼");

        try {
            starBucks.enter(kim).order().exit();
            coffeeBean.enter(lee).order().exit();

            System.out.println(kim);
            System.out.println(lee);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("커피숍별 매출액 요약");
        CoffeeShop.showSaleSummary(starBucks);
        CoffeeShop.showSaleSummary(coffeeBean);

    }
}

/*
AbstractCoffeeShop : 하위 클래스(StarBucks, CoffeeBean) 공통적인 객체 자원

- String name: 커피숍 이름
- int totalSalePrice : 매출
- Map<String, Integer> menus : 메뉴
- Person person;

- AbstractCoffeeShop(String name, Map<String, Integer> menus);

CoffeeShop - 인터페이스 : 커피숍에 대한 설계

- enter(Person person)
- order(String menuName) : 주문 - 커피숍의 매출은 증가, 주문한 사람의 비용은 차감
- exit() : 퇴장
- String getName() : 커피숍 명
- int getTotalSalePrice() : 총 매출액
- static showTotalPrice() : 총 매출액
- static showSaleSummart(CoffeeShop shop)

starBucks

CoffeeBean

Person

- int money
- String name;
- String menu
 */