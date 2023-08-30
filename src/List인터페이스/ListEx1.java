package List인터페이스;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
리스트 인터페이스는 ArrayList, Linked List, Vector의 부모로 *인터페이스*로 구현되어 있음.
리스트 구조는 배열과 유사하고 차이점은 *동적*으로 크기가 변한다는 점
ArrayList, Linked List, Vector 거의 동일한 메소드를 가지고 있어 코드 변환이 자유로움
ArrayList :  리스트 타입의 대표적인 자료 구조 ( 특별한 경우가 아니면 ArrayList 사용 )
- 검색이 빈번한 경우 효율적이며, 맨 뒤에 입력이 일어 나는 경우에는 효과적임
 */
public class ListEx1 {
    public static void main(String[] args) {
        String[] arr = {"1000","2000","3000","10","20","100000"};
        // Arrays.asList(변수) : 이미 만들어진 배열을 ArrayList에 추가
        List<String> list = new ArrayList<>(Arrays.asList(arr));
//        list.add("100");  // List에 값을 추가
//        list.add("200");
//        list.add("300");
        System.out.println(list);    // [100, 200, 300]
        // 특정 위치에 값을 가져 올 때 : .get(index)
        System.out.println(list.get(2));  // 300
        // List의 크기를 가져 올 때 : size()
        System.out.println(list.size());   // 3
        // 리스트내에 해당 하는 항목이 있는지 판별 : contains(문자)
        System.out.println("포함 여부 확인 : " + list.contains("141")); // false
        // remove (객체) : 리스트에서 객체에 해당하는 항목을 삭제하고 그 결과를 반환
        // remove (인덱스) :  해당 인덱스의 값을 삭제하고 삭제된 값을 반환
        System.out.println("삭제 성공 여부 : " + list.remove("2000"));  // true
        list.sort(Comparator.reverseOrder());  // 오름 차순 정렬 naturalOrder, 내림차순 reverseOrder
        System.out.println(list);   // [100, 300]

    }
}
