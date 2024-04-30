package chapter11;

public class MyDog {
    String name;
    String type;

    // 여기부터

    MyDog(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String toString() {
        return type + " " + name;
    }

    // 여기까지 외우기
}

public class Q4 {

    public static void main(String[] args) {
        MyDog dog = new MyDog("멍멍이", "진돗개");
        System.out.println(dog);
    }
}
