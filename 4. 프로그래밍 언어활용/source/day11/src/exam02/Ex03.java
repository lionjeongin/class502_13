package exam02;

public class Ex03 {
    public static void main(String[] args) {
        FruitBox<Toy> toyBox = new FruitBox<>();
        toyBox.add(new Toy());
        // Jucier.make(toyBox); // 오류 발생 / Apple, Grape, Fruit  -> 상한 제한 Toy는 못 함
    }
}
