package exam07;

public class Ex01 {
    public static void main(String[] args) {
        Book book = new Book();
        System.out.println(book); // book.toString
        Class cls = Book.class;
        Class cls2 = book.getClass();
    }
}
