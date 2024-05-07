package exam01;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex05 {
    public static void main(String[] args) {
        String[] names = {"이름1", "이름1", "이름2", "이름3", "이름4", "이름5"};
        //List<String> namesList = Arrays.stream(names).collect(Collectors.toList());
        // toList 너무 많이 써서 굳이 collect 안 써도 된다! 많이 써서 기능이 stream에 있음!
        List<String> namesList = Arrays.stream(names).toList();
        // toList 만 가지고 써도 된다!!
        System.out.println(namesList);

        Set<String> namesSet = Arrays.stream(names).collect(Collectors.toSet());
        System.out.println(namesSet); // 중복 제거

    }
}
