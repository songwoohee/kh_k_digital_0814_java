package 저항값구하기;

import java.util.Scanner;

/*
[  색  ] [ 값 ]  [ 곱 ]
 black     0      1
 brown     1      10
 red       2      100
 orange    3      1,000
 yellow    4      10,000
 green     5      100,000
 blue      6      1,000,000
 violet    7      10,000,000
 gray      8      100,000,000
 white     9      1,000,000,000
[ 입력 ]
첫째 줄에 첫번째 색, 둘째 줄에 두 번째 색, 셋째 줄에 세 번째 색이 주어 진다
[ 출력 ]
입력으로 주어진 저항의 저항값을 계산하여 출력. (1&2번째는 값이, 3번째는 곱의 값이 출력)
[ 예시 입력 ]
yellow
violet
red
[ 예시 출력 ]
4700
 */
public class ColorSum {
    public static void main(String[] args) {
        String[] color = {"black","brown","red","orange","yellow","green","blue","violet","gray","white"};
        int[] num = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
        int fVal = 0, sVal = 0, tVal = 0;
        Scanner sc = new Scanner(System.in);
        String fColor = sc.nextLine();
        String sColor = sc.nextLine();
        String tColor = sc.nextLine();
        for (int i = 0; i < 10; i++) {
            if(fColor.equals(color[i])) fVal = i;
            if(sColor.equals(color[i])) sVal = i;
            if(tColor.equals(color[i])) tVal = num [i];
        }
        System.out.println((long)((fVal * 10) + sVal) * tVal);




    }
}
