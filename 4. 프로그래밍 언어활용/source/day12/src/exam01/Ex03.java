package exam01;

import java.util.ArrayList;

public class Ex03 { // 향상된 for문이나 람다식 forEach로 Ex02 코드 줄이기
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1000, "책1", "저자1"));
        books.add(new Book(1001, "책2", "저자2"));
        books.add(new Book(1002, "책3", "저자3"));
        books.add(new Book(1003, "책4", "저자4"));
        books.add(new Book(1004, "책5", "저자5"));

        for (Book book : books) { // 방법1 : 향상된 for문
            System.out.println(book);

        }

        books.forEach(System.out::println); // 방법2 : forEach 람다식 메서드 참조를 이용
    }
}
/*
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