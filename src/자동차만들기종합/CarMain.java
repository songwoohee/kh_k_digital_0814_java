package 자동차만들기종합;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        final int[] dist = {0, 400, 150, 200, 300};
        Car car = null;  // 부모 클래스에 대한 객체를 만든다. 부모 클래스의 참조 변수를 만드는데 초기값으로 null을 대입
        Scanner sc = new Scanner(System.in);
        System.out.print("이동 지역 : [1] 부산 [2] 대전 [3] 강릉 [4] 광주 : ");
        int city = sc.nextInt();
        System.out.print("이동할 승객 수 (1 - 100) : ");
        int passCnt = sc.nextInt();
        System.out.print("차량 선택 [1] 스포츠카 [2] 승용차 [3] 버스 : ");
        int carsel = sc.nextInt();
        System.out.print("부가 기능 [1] ON [2] OFF : ");
        int option = sc.nextInt();
        boolean isMode = (option == 1) ? true : false;
        switch (carsel) {
            case 1: car = new SportsCar("포르쉐 911"); break;
            case 2: car = new Sedan("제네시스 G80"); break;
            case 3: car = new Bus("고속버스"); break;
            default:
                System.out.println("차량이 선택이 잘못 되었습니다. ");
        }
        car.setMode(isMode);  // 모드 on/off
        int moveCnt = car.getMovigCnt(passCnt);  // 승객의 수로 이동 횟수 구하는 메서드
        System.out.println("=".repeat(7) + car.getName() + "=".repeat(7));
        System.out.println("총 비용 : " + car.getTotalCost(dist[city], moveCnt));
        System.out.println("총 주유 횟수 : " + car.getRefuelCnt(dist[city], moveCnt));
        System.out.println("총 이동 시간 : " + car.getMovingTime(dist[city], moveCnt));

    }
}
