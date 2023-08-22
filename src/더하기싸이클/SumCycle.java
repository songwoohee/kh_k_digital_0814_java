package 더하기싸이클;

import java.util.Scanner;

// 0 <= n <= 99
// 입력 받은 수를 더하기 싸이클 조건을 수행 했을 때 몇 회만에 원래 입력한 수와 같아지는지 확인 하는 문제
// 입력 26 -> 2와6을 분리해서 더함-> 8
// 원래 값의 1의 자리와 새롭게 만들어진 수의 1의 자리를 다시 더함 -> 68
// 1cycle------------------------------------------------------
// 6 + 8 = 14, 원래 값의 1의 자리와 새롭게 만들어진 수의 1의 자리를 다시 더함 (8 + 4)
// 2cycle------------------------------------------------------
//
public class SumCycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        int input = sc.nextInt();  // 최초 숫자를 입력 받음
        int totalCnt = 0; // 총 싸이클 누적 횟수
        int calcNum = input;  // 최초 입력값이 변경 되지 않도록 하기 위해서
        int divSum = 0; // 수를 10자리와 1의 자리로 분리해서 더하기 위한 변수
        int newNum = 0;

        while(true) {
            totalCnt++;
            divSum = (calcNum / 10) + (calcNum % 10);  // 10의 자리와 1의 자리를 분리해서 더함
            newNum = (calcNum % 10) * 10 + (divSum % 10); // 앞의 1의 자리의 + 계산된 값의 1의 자리를 더함
            if(newNum == input) break;
            calcNum = newNum;

        }
        System.out.println(totalCnt);

    }
}
