package coffee;

public class Person {

    String name;
    int money;

    Person(String name, int money ){
        this.name = name;
        this.money = money;
    }

    public void buyStarCoffee(StarCoffee sCoffee, int money) {
        String message = sCoffee.brewing(4000);

    }

    public void buyBeanCoffee(BeanCoffee bCoffee, int money) {
        String message = bCoffee.brewing(4500);

    }
}