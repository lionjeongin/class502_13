package exam01;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Ex06 {
    public static void main(String[] args) {
        HashSet<Book> books = new HashSet<>();
        books.add(new Book(1000, "책1", "저자1"));
        books.add(new Book(1000, "책1", "저자1")); // 배제 안 된다. 동등성에 대한 비교 기준이 한 가지 더 있다.
        books.add(new Book(1000, "책2", "저자2"));
        books.add(new Book(1000, "책3", "저자3"));
        books.add(new Book(1000, "책4", "저자4"));
        books.add(new Book(1000, "책5", "저자5"));

        for (Book book : books) {
            System.out.println(book);
            // 동등성에 대한 비교 기준이 한 가지 더 있다.
            // 동등성에 대한 비교는 equals값 말고도 hashCode값도 비교해야한다.
        }
    }
}
/*
결과
Book{isbn=1000, title='책1', author='저자1'}
Book{isbn=1000, title='책3', author='저자3'}
Book{isbn=1000, title='책5', author='저자5'}
Book{isbn=1000, title='책4', author='저자4'}
Book{isbn=1000, title='책1', author='저자1'}
Book{isbn=1000, title='책2', author='저자2'}
 */
