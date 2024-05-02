package exam01;

import java.util.function.Supplier;

public class Ex08 {
    public static void main(String[] args) {
        Supplier<Book> s1 = () -> new Book(); // Book이라는 객체를 만들었다.
        // Supplier -> 들어오는 게 없고 나가는 것만 있는 인터페이스
        Supplier<Book> s2 = Book::new;

        Book b1 = s2.get();
        System.out.println(b1);
    }
}
