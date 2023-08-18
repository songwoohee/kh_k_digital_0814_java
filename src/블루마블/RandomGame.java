package 블루마블;
// 두개의 주사위를 던져 12가 나오면 탈출하는 게임
//Math.random()  0 이상 1미만 실수값을 표기
public class RandomGame {
    public static void main(String[] args) {
        int rand1, rand2;
        int cnt = 0; // 몇 번만에 탈출 했는지 숫자 세기
        while(true) {
            cnt++;
            rand1 = (int) ((Math.random() * 6) + 1);
            // Math.random() * 6 > 0.1 ~ 5.99 출력 > +1 > 1.1 ~ 6.9 > int 정수 표기니까 1 ~ 6사이 값 출력
            rand2 = (int) ((Math.random() * 6) + 1);
            if ((rand1 + rand2) == 12 ) {
                System.out.printf("무인도를 %d번만에 탈출 합니다.\n", cnt);
                break;
            } else {
                System.out.println("주사위의 합이" + (rand1 + rand2) + "입니다.");
            }

        }
    }
}

//   출력 예시
//        주사위의 합이3입니다.
//        주사위의 합이5입니다.
//        무인도를 3번만에 탈출 합니다.