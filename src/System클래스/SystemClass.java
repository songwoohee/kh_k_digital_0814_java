package System클래스;
/*
현재 시간 읽기 - 실행 시간 측정
 */
import static java.lang.Thread.sleep;

public class SystemClass {
    public static void main(String[] args) throws InterruptedException {
//        long time = System.currentTimeMillis();
//        long nanoTime = System.nanoTime();
//
//        System.out.println(time);
//        System.out.println(nanoTime);

        int[] data = new int[1000];
        int cnt = 0, i;
        int randVal = (int)((Math.random() * 1000) + 1);
        for (i = 0; i < data.length; i++) {
            data[i] = i+1;
        }
        long startTime = System.currentTimeMillis();  // 시작 시간
        for (i = 0; i < data.length; i++) {
            cnt++;  // 몇 번만에 찾았는지 횟수 구하기
            sleep(1);  // 1000분의 1초 동안 잠재우기
            if(randVal == data[i]) {
                System.out.println("위치 : " + (i+1));
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("총 검색 횟수 : " + cnt);
        System.out.println("검색에 소요된 시간 : " + (endTime - startTime) + " 밀리초 입니다.");

        // 시스템 정보 가져오기
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("os.home"));

    }
}
