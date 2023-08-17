package 조건문;

import java.util.Scanner;

// 조건문은 조건을 만족 하는 경우와 만족 하지 않는 경우로 나누어 수행 하는것
public class ConditionEx {
    public static void main(String[] args) {

//        System.out.print("정수를 입력 하세요 : ");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        if (num > 100) {
//            System.out.println(num + "은 100보다 커요.");
//        } else if (num  < 100){
//            System.out.println(num + "은 100보다 작아요.");
//        } else {
//            System.out.println(num + "은 100과 같아요");
//        }
        // 대문자가 소문자보다 앞에 있다.

        System.out.print("문자를 입력 하세요 : ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch  >= 'a' && ch <= 'z') {
            System.out.println(ch + "는 알파벳 입니다.");
        } else if (ch  >= 'A' && ch <= 'Z') {
            System.out.println(ch + "는 알파벳 대문자 입니다");
        } else {
            System.out.println(ch + "는 알파벳이 아닙니다.");

        }

    }
}