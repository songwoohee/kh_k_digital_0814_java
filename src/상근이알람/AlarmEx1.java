package 상근이알람;
// 상근이알람
// 시간과 분을 입력 받기 위한 스캐너 생성
// 시간과 분을 각각 입력 받음
// 45분을 빼야 되므로 시간과 분을 총 몇 분인지 환산 > 그 값에 45 빼줌
// 계산된 시간이 45분 보다 작으면 하루 전날이므로 하루의 시간 만큼 더해줌
// 계산된 시간에서 45를 빼줌
// 결과를 시간과 분으로 환산 해서 출력

import java.util.Scanner;

//첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은 현재 상근이가 설정한 놓은 알람 시간 H시 M분을 의미한다.
//입력 시간은 24시간 표현을 사용한다. 24시간 표현에서 하루의 시작은 0:0(자정)이고,
// 끝은 23:59(다음날 자정 1분 전)이다. 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
public class AlarmEx1 {
    public static void main(String[] args) {
        // 상근이알람
// 시간과 분을 입력 받기 위한 스캐너 생성
        Scanner sc = new Scanner(System.in);
// 시간과 분을 각각 입력 받음
        System.out.print("시간 분 입력 : ");
        int hour = sc.nextInt();
        int min = sc.nextInt();
// 45분을 빼야 되므로 시간과 분을 총 몇 분인지 환산 > 그 값에 45 빼줌
        int totalmin = hour * 60 + min;
// 계산된 시간이 45분 보다 작으면 하루 전날이므로 하루의 시간 만큼 더해줌
        if (totalmin < 45) {
            totalmin = 24 * 60 + totalmin;
        }
// 계산된 시간에서 45를 빼줌
        totalmin -= 45;
// 결과를 시간과 분으로 환산 해서 출력
        System.out.println((totalmin / 60) + "시" + (totalmin % 60) + "분");
        }
    }
