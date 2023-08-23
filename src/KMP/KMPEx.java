package KMP;
// Knuth-Morris-Pratt > KMP
// Mirko-Slavko > MS

// split("")를 이용 해서 문자열을 자르고 자른 문자열의 0번째 인덱스를 선택하는 방법
// 0번째 선택, "-" 다음의 첫번째 문자를 선택 하는 방법
// 대문자만 골라 오는 방법 ( charAt(인덱스), toCharArray() )

import java.util.Scanner;

public class KMPEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력 하세요 : ");
        String name = sc.next();
        String [] n = name.split("-",0);
       // System.out.println(name.split("-"));
        for (int i = 0; i < name.length(); i++) {
            System.out.print(n[i]);
        }

    }
}
