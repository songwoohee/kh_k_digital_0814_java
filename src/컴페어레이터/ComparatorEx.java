package 컴페어레이터;

import java.util.TreeSet;

/*
두개의 메소드를 비교하는 방법
두 매개변수를 비교하는 인터페이스
 */
public class ComparatorEx {
    public static void main(String[] args) {
        TreeSet<Fruit> set = new TreeSet<>(new DesendComparator());
        set.add(new Fruit("포도",3000));
        set.add(new Fruit("수박",10000));
        set.add(new Fruit("딸기",6000));
        for(Fruit e : set) {
            System.out.println("과일 이름 : " + e.name + ", 가격 " + e. price );
        }
    }
}
