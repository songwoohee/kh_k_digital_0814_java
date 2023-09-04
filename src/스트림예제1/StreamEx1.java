package 스트림예제1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
스트림이란?
함수형 프로그램을 이용해 다양한 데이터 소스를 표준화된 방법으로 다루기 위한 것.
특징
1. 자료의 대상에 상관 없이 동일한 연산 수행
2. 내부 반복자 사용(반복문 배제 하기 위한 방법)
3. 원본 데이터를 변경 하지 않음
4. 지연 연산과 병렬 처리 지원 (성능 향상을 위한 방법)
 */
public class StreamEx1 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        // 스트림을 생성(1회용-사용하고 나면 없어짐), 중간 연산, 최종 연산
        //list.stream().filter(s->s.intValue() >= 5).forEach(e->System.out.print(e + " "));
       // int sumVal = list.stream().mapToInt(e->e).sum(); // mapToInt(e,int stream 으로 변환)
        int sumVal = list.stream().reduce(0,(e1,e2)->e1 + e2);
        int count = list.size();   // = (int) list.stream().count();
        System.out.println("합계 : " + sumVal);
        System.out.println("횟수 : " + count);




    }
}
