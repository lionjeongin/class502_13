package exam01;

import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex04 {
    public static void main(String[] args) {

        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //return o1.compareTo(o2); // 오름차순
                // return o2.compareTo(o1); // 내림차순
                return o1.compareTo(o2) * -1; // 내림차순  // 3.
             }
        };

       //1. HashSet<String> names = new HashSet<>();
        //Set<String> names = new TreeSet<>(comp);  //2. // 다형성 이용해서 알게 모르게 쓰려면 TreeSet을 Set<String>으로 바꾸기
        Set<String> names = new TreeSet<>(Comparator.reverseOrder()); //  이미 역순 정렬기능이 만들어져 있다!
        names.add("이름1");
        names.add("이름2");
        names.add("이름2");
        names.add("이름3");
        names.add("이름5");
        names.add("이름4");

        System.out.println(names); // names.toString()

    }
}
/* 결과 1.
[이름3, 이름2, 이름1, 이름5, 이름4]

결과 2.
[이름1, 이름2, 이름3, 이름4, 이름5]

결과 3.
[이름5, 이름4, 이름3, 이름2, 이름1]
 */