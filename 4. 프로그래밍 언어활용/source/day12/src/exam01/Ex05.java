package exam01;

import com.sun.source.util.Trees;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex05 {
    public static void main(String[] args) {
        //HashSet<Book> books = new HashSet<>();
        Set<Book> books = new TreeSet<>(Comparator.reverseOrder()); // 다형성 이용 HashSet<Book> -> Set<Book>, HashSet<> -> TreeSet<>
        books.add(new Book(1003, "책4", "저자4"));
        books.add(new Book(1004, "책5", "저자5"));
        books.add(new Book(1000, "책1", "저자1"));
        books.add(new Book(1001, "책2", "저자2"));
        books.add(new Book(1001, "책2", "저자2"));
        books.add(new Book(1002, "책3", "저자3"));


        for (Book book : books) {
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
 */