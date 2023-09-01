package 명령어이력조회;
/*
Queue 중간 삽입 허용 안함 / List는 중간 허용
Queue 중간에 삽입 삭제가 일어 나면 안됨
(중간 삽입 허용 하면 안됨, 중간 삽입 허용 하고 싶으면 LinkedList 사용 하믄됨)
 */

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class CommandHistroy {
    Queue<String> queue = new LinkedList<>();
    final static int MAX_SIZE = 10;
    public static void main(String[] args) {
        CommandHistroy histroy = new CommandHistroy();
        System.out.println("help를 입력하면 도움말을 볼 수 있습니다");
        while (true) {
            System.out.print("$ ");
            Scanner sc = new Scanner(System.in);
            String cmd = sc.nextLine().trim();  // 입력 받은 문자열 앞/뒤의 공백 제거
            if(cmd.equalsIgnoreCase("q")) {
                System.exit(0); // 프로그램 강제 종료
            } else if(cmd.equalsIgnoreCase("help")) {
                System.out.println("help - 도움말을 보여 줍니다.");
                System.out.println("q/Q - 프로그램 종료");
                System.out.println("history - 최근 입력한 명령어를 " + MAX_SIZE + " 개 보여 줍니다");
            } else if(cmd.equalsIgnoreCase("history")) {
                histroy.save(cmd);
                int cnt = 0;
                for(String e : histroy.queue) {  // queue 자동 순회
                    cnt++;
                    System.out.println(cnt + " " + e);
                }
            } else {
                histroy.save(cmd);
                System.out.println(cmd);
            }

        }
    }
    void save(String cmd) {
        queue.offer(cmd);
        if(queue.size() > MAX_SIZE) queue.remove(); // queue의 사이즈가 정한 MAX_SIZE 보다 크면 맨 앞의 요소 제거
    }


}
