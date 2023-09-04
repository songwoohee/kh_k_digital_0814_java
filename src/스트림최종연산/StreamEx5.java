package 스트림최종연산;

import java.util.Optional;
import java.util.stream.Stream;

/*
요소의 소모 : 메소드는 첫 번째와 두 번째 요소를 가지고 연산을 수행한 뒤, 그 결과와 세 번째 요소를 가지고 또다시 연산을 수행합니다.
 */
public class StreamEx5 {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("넷","둘","셋","하나");
        Stream<String> stream2 = Stream.of("넷","둘","셋","하나");

        Optional<String> rst1 = stream1.reduce((s1, s2)->s1 + "++" + s2);
        rst1.ifPresent(e-> System.out.print(e + " "));   // 넷++둘++셋++하나
        System.out.println();

        String rst2 = stream2.reduce("시작", (s1, s2)->s1 + "++" + s2);
        System.out.print(rst2);



    }
}
