package 문자열반전;

import java.util.Scanner;

// 문자열을 입력 받음 abcd > dcba
// 문자열의 길이를 length()로 확인 가능
// 반전
public class CharaterReverse {
    public static void main(String[] args) {
        // for문 내가 푼거
//        Scanner sc = new Scanner(System.in);
//        System.out.print("단어를 입력 하세요 : ");
//        String a = sc.next();
//
//        for(int i = a.length()-1; i >= 0; i--) {
//            System.out.print(a.charAt(i));
//        }

        // while문

        Scanner sc = new Scanner(System.in);
        System.out.print("단어를 입력 하세요 : ");
        String input = sc.next();
        int pos = input.length()-1; // 문자열의 시작 위치(반전의 위치에 대한 시작)
        while (pos > -1) {
            System.out.print(input.charAt(pos));
            pos--;
        }


    }
}
// 출력 예시
//단어를 입력 하세요 : 으엑어려워
//        워려어엑으