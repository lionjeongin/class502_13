package exam01;
// T는 Fruit의 하위 클래스
public class Box<T extends Fruit & Eatable> { // T = type 매개변수를 의미/ Box : 원시타입 / Box<T> : 지네릭 클래스,
    private T item; // T = Apple이 될 수 도 있고 Grape가 될 수 있다. 따라서 T - object로 있다.

    // private static T item2; - 사용 불가, 처음부터 공간을 할당 받으므로 자료형이 명확해야 함

    // private static T[] nums = new T[3]; // 사용 불가, 배열에서 공간 생성을 위해서는 자료형이 명확해야 함

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public String toString() {
        // T == Object
        // item.get()
        //return null; // 상속에 대한 정의
        return item.get();
    }
}
