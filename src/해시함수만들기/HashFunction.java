package 해시함수만들기;
/*
Hash : 값을 생성하면 고유 주소 값이 생기는데 이것을 숫자로 변환 하는 것을 해시코드라 한다.
Hash 함수란 ?
데이터의 효율적인 관리를 위해 임의의 길이를 가진 데이터를 고정된 길이를 가진 데이터로 매핑 해주는 함수(암호화 기법)
 */
import java.util.Scanner;

public class HashFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 :  ");
        String in = sc.next();
        int sum = 0;
        for (int i = 0; i < in.length(); i++) {
            sum += in.charAt(i);   // 문자열에서 문자의 ASCII 코드값을 더해줌
        }
        System.out.println("배열의 인덱스 : " + (sum % 100));
    }
}
// 출력
//문자열 입력 :  a
//배열의 인덱스 : 97