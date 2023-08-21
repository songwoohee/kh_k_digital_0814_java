package 대소문자변환;

import java.util.Scanner;

// 영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤,
// 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램을 작성하시오.
// charAt(index) : 문자열에 해당 인덱스 문자를 추출
// toCharArray() : 문자열을 문자 배열로 변환
// 아스키코드
public class AlphaChange {
    // 스캐너 생성
    // 문자열 입력 받음
    // 문자열 길이 만큼 순회하면서 문자에 대한 ASCII 값 확인 대문자, 소문자인지 확인하고 계산해줌
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("알파벳을 입력 하세요 : ");
        String alpha = sc.next();
// 문자열 길이 만큼 순회하면서 문자에 대한 ASCII 값 확인 대문자, 소문자인지 확인하고 계산해줌
        for (int i = 0; i < alpha.length(); i++) {
            char ch = alpha.charAt(i);
            if(ch < 'a') System.out.print((char) (ch + ('a' - 'A')));  // 'a'-'A' 아스키코드 97-65 이런식으로 빼진다
            else System.out.print((char)(ch - ('a' - 'A')));

            }

        }

    }

