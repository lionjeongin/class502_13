package exam03;

public class Ex01 {
    public static void main(String[] args) {
        Human human = new Human(); // Human, Animal 가능
        // Animal human = new Human();
        human.move(); // 움직인다!

        Tiger tiger = new Tiger(); // Tiger, Animal 가능
        tiger.move(); // 움직인다!

        Bird bird = new Bird(); // Bird, Animal 가능
        bird.move(); // 움직인다!

        Human[] animals = new Human[3];
        animals[0] = human;
        // animals[1] = tiger; -> 오류 : 배열은 무조건 같은 자료형이어야 한다!

        /*
        Animal[] animals = new Human[3];
        animals[0] = human;
        animals[1] = tiger; -> 이건 가능
         */

    }
}
