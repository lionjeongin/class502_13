package middleTest;

public class Test01 {
    String name;
    String type;

    MyDog(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String toString() {
        return type + "" + name;
    }
}
