package Arrays클래스;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
Arrays클래스는 배열을 다루기 위한 다양한 메소드가 포함되어 있습니다.

 */
public class ArraysClass {
    public static void main(String[] args) {
        Integer[] arr = {5, 3, 4, 7, 8, 6, 9, 2, 1};
        //Arrays.sort(arr);   // 출력 1 2 3 4 5 6 7 8 9 (오름차순 정렬)
//        Arrays.sort(arr, Collections.reverseOrder());   // 9 8 7 6 5 4 3 2 1  내림차순 정렬
//        for(int e: arr) System.out.print(e + " ");
        // 정렬 오버라이딩 : 재정의
//        Arrays.sort(arr, new Comparator<Integer>() {   // 오버라이딩 한번 사용하고 끝
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if(o1 > o2) return 1;   // 오름 차순, 앞 1번이 크면 바꿔줘 >  큰 값이 뒤로 가니 오름차순 정렬
//               // if(o1 < o2) return 1;   // 내림 차순,
//            }
//        }

    }
}
