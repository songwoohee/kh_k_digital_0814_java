package X보다작은수;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
[문제]
정수 N개로 이루어진 배열 A와 정수 X가 주어진다. 이때 A에서 X보다 작은 수를 모두 출력
[입력]
첫째 출에 N과 X가 주어진다 (1 <= N, X <= 10,000)
둘째 줄에 수열 A를 이루는 정수 N개가 주어 진다. 주어 지는 정수는 모두 1보다 크거나 같고
10,000보다 작거나 같은 정수
[출력]
X보다 작은 수를 입력 받은 순서대로 공백으로 구분해 출력. X보다 작은 수는 적어도 하나 존재
[예시]
10 5
1 10 4 9 2 3 8 5 7 6
=>결과 1 4 2 3
 */
public class XLessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();   // 배열의 갯수
        int x = sc.nextInt();   // 크기를 비교하는 기준 값(미만 값을 찾음)
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());   // 입력 받은 값이 바로 리스트로 들어감(리스트에 값 추가)
            if(list.get(i) < x) System.out.print(list.get(i) + " ");
        }
        System.out.println();
        }



    }

