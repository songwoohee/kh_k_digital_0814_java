package 스트림예제2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;

/*
반복자 스트림 (forEach()) : 내부 반복자, 스트림 요소에 대한 순차 접근을 제공하며, 최종 연산에 해당 합니다.
 */
public class StreamEx2 {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>(Arrays.asList("고유림","나희도","백이진"));
//        for(String e : list) System.out.print(e + " ");
//        Iterator<String> iterator = list.iterator();
//        while(iterator.hasNext()) {  // 위 향상된 for문과 동일하게 출력
//            String name = iterator.next();
//            System.out.print(name + " ");
//
//            list.forEach(e-> System.out.print(e + " "));  // 최종 연산


        List<Student> list = Arrays.asList(   // 배열의 요소를 바로 리스트에 넣어준 것.
                new Student("고유림", 67),
                new Student("나희도", 55),
                new Student("우영우", 99),
                new Student("최수연", 96),
                new Student("권민우", 92)
        );
        double average = list.stream() // 스트림 생성
                .mapToInt(e->e.getScore())      // 중간 연산 : e는 객체(student), 메소드 참조 / 람다식 : Student::getScore
                .average()      // 중간 연산
                .orElse(0.0); // 최종 연산 , 스트림이 비어 있으면 0.0 으로 반환

        System.out.println("평균 점수 : " + average);

        IntStream stream = IntStream.rangeClosed(1, 100);  // 1 - 100까지
        // int sum = stream.sum();
        System.out.println("합계 : " + stream.sum());


//        list.forEach(s->{    // list.stream().forEach -> stream 생략 가능, foreach로 구현
//            String name = s.getName();
//            int score = s.getScore();
//            System.out.println(name + " : " + score );
//        });
//        for(Student s : list) {     // 향상된 for문으로 구현
//            String name = s.getName();
//            int score = s.getScore();
//            System.out.println(name + " : " + score );
//        }
//        list.parallelStream().forEach(s-> {  // parallelStream : 내부 반복자를 이용한 병렬처리
//            String name = s.getName();
//            int score = s.getScore();
//            System.out.println(name + " : " + score );
//        });

        }

    }

class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}