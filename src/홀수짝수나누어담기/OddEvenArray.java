package 홀수짝수나누어담기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
[문제]
7개의 정수를 입력 받는 메서드 (0이 들어 올 수 있음)
홀수와 짝수 배열로 나누어 담는 메서드 만들기
홀수와 짝수를 출력 하는 메서드 만들기
[입력]
1 2 3 4 5 6 7
[출력]
홀수 : 1 3 5 7
짝수 :  2 4 6
클래스 생성해서 만들기
 */
public class OddEvenArray {
    public static void main(String[] args) {
        ArrayMethod arrayMethod = new ArrayMethod();
        arrayMethod.inputValue();
        arrayMethod.calcMethod();
        arrayMethod.printMethod();


//        // stream 으로  구현
//        Scanner sc = new Scanner(System.in);
//        List<Integer> list = new ArrayList<>();
//        System.out.print("정수 입력 : ");
//        for (int i = 0; i < 7; i++) list.add(sc.nextInt());
//        System.out.print("홀수 : ");
//        list.stream().filter(n->n % 2 !=0).forEach(e-> System.out.print(e + " "));
//        System.out.println();
//        System.out.print("짝수 : ");
//        list.stream().filter(n->n % 2 ==0).forEach(e-> System.out.print(e + " "));

    }
}

class ArrayMethod {
    List<Integer> inList = new ArrayList<>();
    List<Integer> oddList = new ArrayList<>();
    List<Integer> evenList = new ArrayList<>();


    // 정수값 입력 받는 메소드
    void inputValue() {
        int tmp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        for (int i = 0; i < 7; i++) {
            inList.add(sc.nextInt());
        }
//        while (true) {
//            tmp = sc.nextInt();
//            if (tmp == 999) break;
//            inList.add(tmp);
//        }
    }
    // 짝수 홀수 구분
        void calcMethod() {
            for(Integer e : inList) {
                if(e % 2 == 0) evenList.add(e);
                else oddList.add(e);
            }
        }
        // 출력
        void printMethod() {
            System.out.print("홀수 : ");
            for(Integer e : oddList) System.out.print(e + " ");
            System.out.println();
            System.out.print("짝수 : " );
            for(Integer e : evenList) System.out.print(e + " ");
            System.out.println();
    }



}

