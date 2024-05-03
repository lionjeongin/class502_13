package exam01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Ex09 {
    public static void main(String[] args) {
        List<String> alpah = Arrays.asList("abc", "def", "ghi");
        String[] upperAlah2 = alpah.stream().map(new Function<String, String>() {

            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        })

        // String[] upperAlpah = alpah.stream().map(s -> s.toUpperCase()).toArray(i -> new String[i]);
        //-> String[] upperAlpah = alpah.stream().map(String::toUpperCase).toArray(i -> new String[i]);
        String[] upperAlpah = alpah.stream().map(String::toUpperCase).toArray(String[]::new);

        System.out.println(Arrays.toString(upperAlpah));
    }
}
