package 요금계산하기;
/*
[문제]
영식 요금제 : 30초당 10원 (30초가 되면 2통이 됨)
민식 요금제 : 50초당 15원
동호가 저번 달에 새악대로 T 통신사를 이용할 때 통화 시간 목록이 주어지면
어느 요금제를 사용 하는 것이 저렴한지 출력하는 프로그램을 작성하시오.
[입력]
통화의 개수 N이 주어진다. N은 20보다 작거나 같은 자연수
둘째 줄에 통화시간 N이 주어진다. 통화시간은 10,000보다 작거나 같은 자연수
ex. 3
 40 40 40
[출력]
첫 번째 줄에 통화의 횟수(최대 통화 횟수 20회 미만) , 두 번째 줄에 통화당 통화 시간(초단위)
출력은 싼 요금제를 출력  영식 = Y 60 , 민식 = M 45
총 통화 요금이 같은 경우는 YM 총 통화 요금 표시
ex.  M 45
 */

import java.util.Scanner;

public class PaymentSystem {
    public static void main(String[] args) {
       int [] call = new int [20];  // 통화 횟수에 대한 배열을 만든다 > 통화 횟수에 대한 통화 시간을 입력 받기 위한 배열
        int yPay = 0, mPay = 0;
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt(); // 통화 횟수를 입력 받아 변수에 대입
        for (int i = 0; i < cnt; i++) { // 통화 횟수당 통화 시간을 입력 받음.
            call[i] = sc.nextInt();
        }
        // 총 통화 요금 구하기
        for (int i = 0; i < cnt; i++) {
            yPay += (call[i] / 30) * 10 + 10;  // 기본 한통화가 있음
            mPay += (call[i] / 60) * 15 + 15;
        }
        if(yPay > mPay) {
            System.out.println("M" + mPay);
        } else if (yPay < mPay) {
            System.out.println("Y" + yPay);
        } else {
            System.out.println("YM" + yPay);
        }
    }
}


