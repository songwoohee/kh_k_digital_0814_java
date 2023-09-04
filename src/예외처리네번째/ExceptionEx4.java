package 예외처리네번째;

import java.util.Scanner;

/*
ArithmeticException : 0으로 나누면 발생 합니다.
finally : 예외에 상관 없이 무조건 수행되는 구문 입니다.
 */
public class ExceptionEx4 {
    public static void main(String[] args) {
        int rst = 0;
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("나눗셈 입력 : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            try {
                rst = a / b;
            } catch (ArithmeticException e) {
                System.out.println("0으로 나눌 수 없습니다. 다시 입력해 주세요.");
                continue;
            } finally {  // 예외에 상관 없이 무조건 수행되는 구문 입니다. finally문이 있으면 catch문 다음에 무조건 finally로 떨어짐 -> 그래서 continue 가 있어도 종료(break) 되버림.
                System.out.println("결과 : " + rst);
                break;
            }
        }
    }
}
