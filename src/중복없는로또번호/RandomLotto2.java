package 중복없는로또번호;

import java.util.ArrayList;
import java.util.List;

//ArrayList 로 풀기
public class RandomLotto2 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        int tmp;
        while(true) {
            tmp = (int) ((Math.random() * 45) + 1);
            if(!list.contains(tmp)) {
                list.add(tmp);
            }
            if(list.size() == 6) break;
        }
        System.out.println(list);
    }
}

