package 해시셋;

import java.util.Arrays;
import java.util.HashSet;

/*
중복 허용 하지 않음, 순서 보장 하지 않음, 수학의 집합과 유사한 개념
 */
public class HashSetMain {
    public static void main(String[] args) {
          HashSet<String> set = new HashSet<>();
          set.add("Java");
          set.add("C");
          set.add("C++");
          set.add("Python");
          set.add("Java");   // add 안됨
          for(String e : set) System.out.print(e + " ");   // 출력 Java C++ C Python


//        HashSet<String> set = new HashSet<>(Arrays.asList("H","e","l","l","o"));
//        System.out.println(set);   // 출력 [e, H, l, o]
//        위와 같은 내용을 배열로 구현
//        String[] arr = {"H","e","l","l","o"};
//        HashSet<String> set = new HashSet<>(Arrays.asList(arr));
//        System.out.println(set);
    }
}
