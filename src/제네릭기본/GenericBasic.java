package 제네릭기본;
/*
데이터의 타입(data type)을 일반화한다(generalize)는 것을 의미
데이터 형식에 의존하지 않고, 하나의 값이 여러 다른 데이터 타입을 가질 수 있도록 하는 방법
-> 어떤 값이 참조하는 자료형이 아닌 여러 참조형을 사용할 수 있도록 프로그래밍하는 것을 제네릭 프로그래밍
 */
import java.util.ArrayList;
import java.util.List;

public class GenericBasic {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello");
        String str = (String) list.get(0);
        System.out.println(str);
        // 제네릭 타입으로 변환
        List<String> list2 = new ArrayList<>();   // 타입 변수를 넣어줌 > 여기선 string을 넣어줌으로써 이후 string형 아무거나 입력 가능
        list2.add("java");
        String str2 = list2.get(0);
        System.out.println(str2);

    }
}
