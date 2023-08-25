package 저항값구하기;

import java.util.Scanner;

/*
저항값 구하기 : 컬러 문자열 2개 입력 받음
첫번째 컬러 문자열은 10의 자리 수
두번째 컬러 문자열은 1의 자리 수
세번째 컬러 문자열은 곱하는 수
 */
public class OhmMainEX {
    public static void main(String[] args) {
        String[] color = {"black","brown","red","orange","yellow","green","blue","violet","gray","white"};
        int frt = 0, sec = 0, thd = 0;      // 초기화
        Scanner sc = new Scanner(System.in);
        String firstColor = sc.nextLine();
        String secondColor = sc.nextLine();
        String thdColor = sc.nextLine();
        for (int i = 0; i < color.length; i++) {
            if(firstColor.equals(color[i])) frt = i;    // 첫번째 입력 받은 컬러 문자열의 인덱스 값을 구함 (10의 자리 값)
            if(secondColor.equals(color[i])) sec = i;    // 두번째 입력 받은 컬러 문자열의 인덱스 값을 구함 (1의 자리 값)
            if(thdColor.equals(color[i])) thd = i;    //  세번째 입력 받은 컬러 문자열의 인덱스 값을 구함 (곱하는 수)
         }
        System.out.println((long)((frt * 10) + sec) * (long)(Math.pow(10, thd)));  // Math.pow
      }

    }
// 선생님이랑 같이 풀어 본 문제