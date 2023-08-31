package 해시맵기본;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashBasic {
    public static void main(String[] args) {
        //    KEY,  VALUE
        Map<String, Integer> map = new HashMap<>();
        //   객체 저장 :  put (list는 add)
        map.put("우영우",99);  // 우영우는 키, 99는 값
        map.put("동그라미",55);
        map.put("최수연",95);
        map.put("이준호",80);
        map.put("동그라미",70);  // 키가 같기 때문에 중복으로 간주, 나중에 저장된 값으로 대체되어 출력 (키는 중복 허용X, 값은 중복 가능)
        System.out.println("총 Entry 수 : " + map.size());
        // 출력 총 Entry 수 : 4
        // 객체 찾기 : get(key), 지정된 키에 대한 값을 반환
        System.out.println(map.get("동그라미")); // 70

        // 객체 삭제 :  키 값으로 해당 Entry(키+값)를 삭제
        map.remove("최수연");
        // 향상된 for문으로 map 순회
        for(String key : map.keySet()) {   // key가 set구조 , keySet() key가 포함된 Set 컬렉션으로 반환
            System.out.println(key + "\t" + map.get(key));  // map.get(key) 키에 대한 값을 나열
        }

        // iterator(반복자)를 사용 하는 방법 1. Set 자료 구조를 만들어야함
//        Set<String> keySet = map.keySet();
//        Iterator<String> iterator = keySet.iterator(); // 키셋에 있는 반복자를 찾아내라. map은 반복자가 없어서 keyset에 담아서 반복자 소환
//        while(iterator.hasNext()) {
//            String key = iterator.next();  // 키 값을 뽑아내
//            Integer value = map.get(key);  // 뽑아낸 키 값을 넣어줌
//            System.out.println(key + "\t" + value);
//        }

    }
}
