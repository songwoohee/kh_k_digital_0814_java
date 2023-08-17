package 연습문제;

import java.util.Scanner;

public class Test_2 {
    public static void main(String[] args) {
        // 선생님 답안
        // 세자리의 정수를 입력 받아 가장 큰 수 출력
        int num; // 100의 자리 정수 입력을 받기 위한 변수
        int a, b, c; // 100, 10, 1의 자리 값을 담기 위한 변수
        Scanner sc = new Scanner(System.in);
        System.out.print("100의 자리 정수 입력 : ");
        num = sc.nextInt();
        a = num / 100; //100 으로 나눈 몫
        b = (num % 100) / 10; // 100나눈 나머지를 10으로 나누어서 담음
        c = num % 10; // 10으로 나눈 나머지

        if (a > b) {
            System.out.println(Math.max(a, c));
        } else {
            System.out.println(Math.max(b,c));
        }

    }
}
