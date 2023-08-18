package 스퀘어출력;

import java.util.Scanner;

//input : 3
//output
// 1 2 3
// 4 5 6
// 7 8 9
public class SqaureEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n * n; i++) {
            System.out.printf("%4d",i);
            if(i % n == 0) System.out.println();
        }


    }
}

// 출력 예시
//input : 3
//        1   2   3
//        4   5   6
//        7   8   9
//