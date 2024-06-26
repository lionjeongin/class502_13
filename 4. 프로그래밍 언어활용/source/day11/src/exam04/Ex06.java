package exam04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex06 {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1000, "책1", "저자1"));
        books.add(new Book(1001, "책2", "저자2"));
        books.add(new Book(1002, "책3", "저자3"));
        books.add(new Book(1003, "책4", "저자4"));
        books.add(new Book(1004, "책5", "저자5"));

        Iterator<Book> iter = books.iterator(); // 이걸 추가해야한다!!
        while(iter.hasNext()) {
            Book book = iter.next();
            System.out.println(book);
        }

        iter = books.iterator();
        while(iter.hasNext()) {
            Book book = iter.next();
            System.out.println(book);
        }
    }
}
/* 결과
Book{isbn=1000, title='책1', author='저자1'}
Book{isbn=1001, title='책2', author='저자2'}
Book{isbn=1002, title='책3', author='저자3'}
Book{isbn=1003, title='책4', author='저자4'}
Book{isbn=1004, title='책5', author='저자5'}
Book{isbn=1000, title='책1', author='저자1'}
Book{isbn=1001, title='책2', author='저자2'}
Book{isbn=1002, title='책3', author='저자3'}
Book{isbn=1003, title='책4', author='저자4'}
Book{isbn=1004, title='책5', author='저자5'}
 */