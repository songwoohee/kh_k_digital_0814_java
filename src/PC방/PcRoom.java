package PC방;
// 인원 수
// 예약할 좌석 번호 100개
// 결과는 거절 횟수 출력
import java.util.Scanner;

// 1. 1 - 100번까지의 컴퓨터가 있다
// 2. 들어오면서 번호를 말하고 그 자리에 사람이 없으면 앉고 있으면 거절
// 3. 거절 당하는 사람의 수를 출력하는 프로그램을 작성
// 자리는 맨 처음 모두 비어 있고 어떤 사람이 앉으면 비울 일은 없다.
// 입력
// 첫째줄이 손님의 수 N이 입력. N은 100보다 작거나 같다.
// 둘째줄에 손님이 들어오는 순서대로 각 앉고 싶은 자리 입력
// 예시
// 3
// 1 2 3
// 출력
// 거절 당하는 사람의 수 출력
// 예시 0
public class PcRoom {
    public static void main(String[] args) {
        int[] pcRoom = new int[100]; //pc방 좌석 100개
        int rejectCnt = 0, seatNum;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 인원수 입력 받음
        for(int i = 0;i < num; i++) {
            seatNum = sc.nextInt();
            if(pcRoom[seatNum-1] == 1) rejectCnt++;
            else pcRoom[seatNum-1] = 1;
        }
        System.out.println(rejectCnt);
    }
}
