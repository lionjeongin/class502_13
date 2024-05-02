package exam01;

import java.util.Arrays;
import java.util.List;

public class Ex09 {
    public static void main(String[] args) {
        List<String> alpah = Arrays.asList("abc", "def", "ghi");

        // String[] upperAlpah = alpah.stream().map(s -> s.toUpperCase()).toArray(i -> new String[i]);
        //-> String[] upperAlpah = alpah.stream().map(String::toUpperCase).toArray(i -> new String[i]);
        String[] upperAlpah = alpah.stream().map(String::toUpperCase).toArray(String[]::new);

        System.out.println(Arrays.toString(upperAlpah));
    }
}
