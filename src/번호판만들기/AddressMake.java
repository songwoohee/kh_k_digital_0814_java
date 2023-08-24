package 번호판만들기;
/*
 숫자를 입력
 해당 숫자가 몇 칸을 차지 하는지를 출력 하는 문제
 0을 입력 하면 종료.
 */

import java.util.Scanner;
/*
 [문제]
 각 숫자 사이 1cm의 여백이 들어가야함
 1은 2cm, 0은 4cm, 나머지는 3cm 너비 차지
 호수판의 경계와 숫자 사이에는 1cm의 여백이 들어가야함
 ex. 120 > 여백 2cm + 1은 2cm + 2는 3cm + 0은 4cm  = 2+2+3+4+1+1 = 13cm
 [입력]
 숫자 범위 N , 1 <= N <= 9999
 입력은 마지막에 0이 들어오기 전까지 계속해서 줄 단위로 주어진다.
 또한, 마지막의 0은 처리하지 않는다.
 [출력]
 각 입력마다 얼마만큼 너비를 차지하는지 정수로 출력하면 된다.
 각 출력은 줄바꿈으로 구분
 */

public class AddressMake {
    public static void main(String[] args) {
        // 각 숫자가 차지 하는 자리수를 배열로 만들기
        int[] numSize = {4,2,3,3,3,3,3,3,3,3};
        int sum = 0; // 입력 받은 수가 차지하는 총 자리수
        Scanner sc = new Scanner(System.in);
        while(true) {
            String number = sc.next();
            if (number.equals("0")) break; // 0이 입력 되면 끝남
            for (int i = 0; i < number.length(); i++) {
                sum += numSize[number.charAt(i) - '0']  + 1; //  1을 더하는 각 숫자 마다 여백이 1칸
            }
            System.out.println(sum + 1); // 1을 더하는 이유는 처음 공백을 더해 줌
            sum = 0; // 다음 계산을 위해서 sum 변수를 초기화 함

        }


    }
}
