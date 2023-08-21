package 중복없는로또번호;

import java.util.HashSet;

// Set 자바에서 사용 집합 개념
public class RandomLotto3 {
    public static void main(String[] args) {

        int [] lotto = new int[6];
        int tmp, index = 0; // 임시 로또 번호

        HashSet<Integer> set = new HashSet<>();
        while(true) {
            tmp = (int) ((Math.random() * 45) + 1);
            set.add(tmp);
            if(set.size() == 6) break;
        }
        System.out.println(set);
    }
}
