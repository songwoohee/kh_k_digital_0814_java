package 연습문제;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        // 세자리의 정수를 입력 받아 가장 큰 수 출력
        Scanner sc = new Scanner(System.in);
        System.out.print("세자리를 정수를 입력하세요 : ");
        int num = sc.nextInt();
        int a = num / 100;
        int b = (num % 100) / 10;
        int c = num % 10;
        System.out.println("100의 자리는 : " + a + ", 10의 자리는 : " + b + ", 1의 자리는 : " + c);
        if (a > b) {
            if (a > c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else {
            if (b > c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        }

    }
}
