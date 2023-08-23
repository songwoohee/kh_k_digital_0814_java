package KMP;
// Knuth-Morris-Pratt > KMP
// Mirko-Slavko > MS

import java.util.Scanner;

// split("")를 이용 해서 문자열을 자르고 자른 문자열의 0번째 인덱스를 선택하는 방법
// 0번째 선택, "-" 다음의 첫번째 문자를 선택 하는 방법
// 대문자만 골라 오는 방법 ( charAt(인덱스), toCharArray() )
public class KPMEx2_T {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        // 1.  charAt(인덱스)
//        for (int i = 0; i < name.length(); i++) {
//            if(name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') System.out.print(name.charAt(i));
//        }
        // 2. 첫번째 문자 선택, '-' 다음의 문자 선택
//        for (int i = 0; i < name.length(); i++) {
//            if (i == 0) System.out.print(name.charAt(i));
//            else {
//                if (name.charAt(i) == '-') System.out.print(name.charAt(i + 1));
//            }
//        }
        // 3. Split() 메소드를 이용 하는 방법 > split 자주 이용하니 알아두기 !
//         String[] splitName = name.split("-");
//         for(String e : splitName) {
//             System.out.print(e.charAt(0));
//         }
        // 4. toCharArray() : 문자열을 문자 배열로 변경
        char[] chName = name.toCharArray(); // 문자열을 문자 배열로 변환 > 아스키코드값 가져오려고 변환
        for(char ch : chName) {
            if(ch >= 'A' && ch <= 'Z') System.out.print(ch);
        }
    }
}
