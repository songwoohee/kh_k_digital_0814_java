package 연습문제;

import java.util.Scanner;
// 선생님 답안
public class Test_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("성적을 입력 하세요 : ");
            int score = sc.nextInt();
            if ( score < 0 || score > 100 ) continue;
            if ( score >= 90) System.out.println("A");
            else if(score >= 80) System.out.println("B");
            else if(score >= 70) System.out.println("C");
            else if(score >= 60) System.out.println("D");
            else System.out.println("F");
            break;
        }
    }
}
