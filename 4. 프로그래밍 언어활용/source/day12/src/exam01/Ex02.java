package exam01;

import java.util.ArrayList;
import java.util.ListIterator;

public class Ex02 {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1000, "책1", "저자1"));
        books.add(new Book(1001, "책2", "저자2"));
        books.add(new Book(1002, "책3", "저자3"));
        books.add(new Book(1003, "책4", "저자4"));
        books.add(new Book(1004, "책5", "저자5"));

        ListIterator<Book> iter = books.listIterator();
        System.out.println("--- 순방향 ---");
        while(iter.hasNext()) {
            Book book = iter.next();
            int index = iter.nextIndex();
            System.out.println(book);
            System.out.println("index : " + index);
        }

        System.out.println("--- 역방향 ---");
        while(iter.hasPrevious()) {
            Book book = iter.previous();
            int index = iter.previousIndex();
            System.out.println(book);
            System.out.println("index : " + index);
        }
    }
}
/* 결과
--- 순방향 ---
Book{isbn=1000, title='책1', author='저자1'}
index : 1
Book{isbn=1001, title='책2', author='저자2'}
index : 2
Book{isbn=1002, title='책3', author='저자3'}
index : 3
Book{isbn=1003, title='책4', author='저자4'}
index : 4
Book{isbn=1004, title='책5', author='저자5'}
index : 5
--- 역방향 ---
Book{isbn=1004, title='책5', author='저자5'}
index : 3
Book{isbn=1003, title='책4', author='저자4'}
index : 2
Book{isbn=1002, title='책3', author='저자3'}
index : 1
Book{isbn=1001, title='책2', author='저자2'}
index : 0
Book{isbn=1000, title='책1', author='저자1'}
index : -1
 */
