package 트리셋;

import java.util.TreeSet;

/*
검색 기능을 강화 시킨 자료 구조
데이터가 저장될 때 이진 검색 트리 형태로 저장되고, 값을 검색할 때는 inOrder(left-root-right) 방식으로 탐색함.
작은값 왼쪽 큰 값 오른쪽으로 넣으면서 정렬.
 */
public class TreeSetMain {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(23);
        ts.add(10);
        ts.add(48);
        ts.add(15);
        ts.add(7);
        ts.add(22);
        ts.add(56);
        for(Integer e : ts) System.out.print(e + " ");
        // 출력 7 10 15 22 23 48 56 > 자동 정렬
    }
}
