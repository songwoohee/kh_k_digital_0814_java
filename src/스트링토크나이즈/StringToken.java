package 스트링토크나이즈;

import java.util.Scanner;
import java.util.StringTokenizer;

/*
문자열이 특정 문자열로 연결되어 있는 경우, 구분자 기준으로 부분 문자열로 만듬 (split() 용도가 같음)
split()은 정규표현식을 사용하고 StringTokenizer() 문자열을 사용
countTokens() :  꺼내지 않고 남아 있는 토큰의 수
hasMoreTokens() : 남아 있는 토근이 있는지 여부 확인
nextToken() : 토큰을 하나씩 꺼내 옴
 */
public class StringToken {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 / 기준으로 입력 하세요. : ");
        String names = sc.nextLine();
//        StringTokenizer st = new StringTokenizer(names, "/");
//        String[] nameStr = new String[st.countTokens()];
//        int idx = 0;
//        while(st.hasMoreTokens()) {
//            nameStr[idx++] = st.nextToken();
//        }
        // split으로 구현해보기
//        String[] nameStr = names.split("/");
//        for(String e : nameStr) System.out.print(e + " ");

        String s = new String();
        Class c = s.getClass();   // 스트링에 대한 클래스를 클래스에 대입
        System.out.println(c);    // 어떤 클래스인지 알려주는 용도
    }
}
