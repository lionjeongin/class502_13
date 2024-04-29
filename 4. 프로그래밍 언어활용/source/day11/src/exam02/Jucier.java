package exam02;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Jucier {
    // ? - Fruit, Apple , Grape
    public static void make(FruitBox<? extends Fruit> box) {
        ArrayList<?> fruits =  box.getItems(); // ? 와일드 카드 - 메서드의 매개변수 Object상위라서 Apple과 Grape 둘 다 쓸 수 있다.
        System.out.println(fruits);
    }
    // 지네릭 메서드, extends만 사용 가능
    public static <T extends Fruit> void make3(FruitBox<T> box) {

    }

    // ? - Apple, Fruit, Object
    public static void make2(FruitBox<? super Apple> box) {
        ArrayList<?> fruits = box.getItems();
        System.out.println(fruits); // 하한제한
    }
}