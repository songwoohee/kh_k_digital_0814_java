package 나머지구하기;
/*
10개의 수를 입력 받은 뒤, 이를 42로 나눈 나머지를 구함
나머지를 구한 다음 서로 다른 값이 몇 개 인지 구하는 문제
숫자 10개를 연속으로 입력 받음
 */

import java.util.Scanner;

/*
[문제]
수 10개를 입력 받아 42로 나눈 나머지를 구함.
서로 다른 값이 몇 개 있는지 출력하는 프로그램.

[입력]
첫째 줄부터 열번째 줄까지 숫자가 한 줄에 하나씩 주어짐
1000보다 작거나 음이 아닌 정수.

[출력]
첫째 줄에 42로 나누었을 때 서로 다른 나머지가 몇 개 있는지 출력.

 */
public class ModEx {
    public static void main(String[] args) {
        int[] arr = new int[42];
        int cnt = 0; // 42로 나눈 나머지가 다른 경우에 대한 총 횟수
        int input;  // 입력 받은 값
        Scanner sc = new Scanner(System.in);
        System.out.print("10개의 수를 입력 : ");
        for(int i = 0; i < 10; i++) {
            input = sc.nextInt();
            arr[input % 42] = 1;  // 입력 받은 값을 42로 나눈 나머지에 해당하는 인덱스에 1을 대입
        }
        for(int val : arr) cnt += val;
        System.out.println(cnt);

    }
}
