package N개의숫자함;

import com.sun.jdi.PathSearchingVirtualMachine;

import javax.crypto.spec.PSource;
import java.util.Scanner;

// 첫째 줄에 숫자의 개수가 N (1 <= N <= 100)이 주어진다. 둘째줄에 숫자N개가 공백없이 주어진다
// 입력으로 주어진 숫자 N개의 합을 출력한다
// 예제
// 5
// 54321
// [힌트] 입력을 문자열로 간주해야함. 문자열에 하나의 문자를 추출해야 함
// 추출한 문자가 1일때 '0' = 35라면?
public class NumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String number = sc.next();
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += number.charAt(i) - '0';
        }
        System.out.println(sum);
    }

}
// 출력 예시
// 입력 5
// 입력 12345
// 출력 15