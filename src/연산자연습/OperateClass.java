package 연산자연습;

import java.util.Scanner;

// 산술 연산자 : 사칙 연산(+,-,*,/)과 나머지 연산자 (%)
public class OperateClass {
    public static void main(String[] args) {
        int num1 = 10, num2 = 4;
//        System.out.println("덧셈 : " + (num1 + num2));
//        System.out.println("뺄셈 : " + (num1 - num2));
//        System.out.println("곱셈 : " + (num1 * num2));
//        System.out.println("나눗셈 : " + ((double)num1 / num2));
//        System.out.println("나머지 : " + (num1 % num2));
//        System.out.println("몫 : " + (num1 / num2));
//
        // 대입 연산자 : 변수에 값을 대입 하는 연산자 ( = ), 프로그램에서 '=' 같다라는 의미가 아니고 오른쪽값을 왼쪽값에 대입 한다는 의미
//        System.out.println(num1 += 2); // 복합 대입 연산자 : num1 = num1 + 2 ;
//        System.out.println(num1 -= 2); // 12가 된 상태에서 2을 빼서 10, num1 - 2
//        System.out.println(num1 *= 2); // num1 * 2
//        System.out.println(num1 /= 2); // num1 / 2
        // 증감 연산자 : 단항 연산자, 피연산자의 값을 1 증가 또는 1 감소 시키는 연산자 (파이썬은 없음)
        //System.out.println(num1++); // 11
//        int tmp = --num1;
//        System.out.println(tmp);
//        System.out.println(num1);
        // 비교 연산자 : 두개의 피연산자를 비교 해서 어느 쪽이 큰지를 판단
       int x = 10;
       int y = 20;
       boolean rst1, rst2,rst3;
//        System.out.println(x > y); // 거짓
//        System.out.println(x < y); // 참
//        System.out.println(x == y); // 거짓
//        System.out.println(x != y); // 참
//        System.out.println(x >= y); // 거짓
//        System.out.println(x <= y); // 참
        // 논리 연산자 : and(&&) : 둘다 참인 경우
        // or(||) : 둘 중 하나만 참이면 참
        // not(!) : 현재가 참이면 거짓, 거짓이면 참
//        rst1 = (x > 0) && (x > y); //거짓
//        rst2 = (x > 0) || (x < y); //참
//        rst3 = !((x > 0) || (x < y)); //거짓
//        System.out.println(rst1 + " " + rst2 + " " + rst3);
        // 삼항 연산자 : 3개의 피연산자를 필요로 하는 연산자
        Scanner sc = new Scanner(System.in); // 키보드로 입력 받기 위해
        System.out.print("나이를 입력 하세요 : ");
        int age = sc.nextInt();
        boolean isAdult = (age > 19) ? true : false;
        System.out.println(isAdult);
        // 문자열 결합 연산자
//        System.out.println("java" + 18.04 + 12); // java18.0412 문자가 먼저라 문자처럼 붙여지고
//        System.out.println(3 + 3.3 + "JDK"); // 6.3JDK 숫자가 먼저라 연산되고 그다음 문자가 붙었다
        // 연산자 우선 순위 확인
//        int val1 = 5;
//        int val2 = 5;
//        int val3 = 5;
//        result1 = val1 + val2 * val3;
//        System.out.print(result1);



    }
}
