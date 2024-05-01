package Test;

import java.util.ArrayList;

class Shape {
    public void draw() {
        System.out.println("shape");
    }
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Circle");
    }
}

class Triangle extends Shape {
    public void draw() {
        System.out.println("Triangle");
    }
}
/*
<출력 결과>
Circle
Triangle
Shape
 */

public class ShapeTest {
    public static void main(String[] args) {
        ArrayList<Shape> list = new ArrayList<Shape>(); // 여기 외우기
        list.add(new Circle());
        list.add(new Triangle());
        list.add(new Shape());

        for(Shape s : list) {
            s.draw(); // 여기 외우기
        }
    }
}