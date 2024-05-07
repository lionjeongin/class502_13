package exam01;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Ex10 {
    public static void main(String[] args) {
        Book b = new Book(1000, "책1");
        Optional<String> opt = Optional.ofNullable(null);
        String title = opt.orElseGet(() -> b.getTitle());
       // String title = opt.orElseGet(b::getTitle);
    }
}   //
