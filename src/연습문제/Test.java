package 연습문제;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 1. - 시험 성적을 입력 받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지는 F를 출력하는 프로그램
        //- 0 ~ 100 사이가 아니면 성적이 잘못 입력 되었다고 출력

        System.out.print("점수를 입력 하세요 : ");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if ( score >= 90 ) {
            System.out.println(score + "점은 A등급 입니다.");
        } else if ( 89 >= score && score  >= 80 ) {
            System.out.println(score + "점은 B등급 입니다.");
        } else if ( 79 >= score && score >= 70 ) {
            System.out.println(score + "점은 C등급 입니다.");
        } else if (69 >= score && score >= 60 ) {
            System.out.println(score + "점은 D등급 입니다.");
        } else if ( 59 >= score && score >= 0 ){
            System.out.println("안타깝지만 F등급 입니다.");
        } else {
            System.out.println("잘못 입력 했습니다. 0-100 사이로 다시 입력하세요.");
        }
    }
}

