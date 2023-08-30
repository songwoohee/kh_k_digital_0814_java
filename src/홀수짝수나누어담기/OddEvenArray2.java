package 홀수짝수나누어담기;
// 일반 배열로 풀기
import java.util.Scanner;

/*
[문제]
7개의 정수를 입력 받는 메서드 (0이 들어 올 수 있음)
홀수와 짝수 배열로 나누어 담는 메서드 만들기
홀수와 짝수를 출력 하는 메서드 만들기
[입력]
1 2 3 4 5 6 7
[출력]
홀수 : 1 3 5 7
짝수 :  2 4 6
클래스 생성해서 만들기
 */
public class OddEvenArray2 {
    public static void main(String[] args) {
        Calc_func calcFunc = new Calc_func();
        calcFunc.input();
        calcFunc.oddEven();
        calcFunc.disOutput();
    }
}


class Calc_func {
    int[] arr = new int[7];
    int[] even = new int[7];
    int[] odd = new int[7];
    int eIdx = 0;
    int oIdx = 0;
    public void input () {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            arr[i] = sc.nextInt();
        }
    }
    public void oddEven() {
        for(int i : arr) {
            if(i % 2 == 0) even[eIdx++] = i;
            else odd[oIdx++] = i;
        }
    }
    public void disOutput() {
        System.out.println("홀수 : ");
        for (int i = 0; i < oIdx; i++) System.out.printf("%2d",odd[i]);
        System.out.println();
        System.out.println("짝수 : ");
        for (int i = 0; i < eIdx; i++) System.out.printf("%2d",even[i]);
        System.out.println();
    }
}
