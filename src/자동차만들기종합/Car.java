package 자동차만들기종합;
/*
 상속을 주기 위한 Car Class 생성
 */

public abstract class Car {
    // protected 접근제한자는 같은 패키지와 상속 관계에서 접근 가능
    protected int maxspeed;  // 최고 속도
    protected int fuelEff;  // 연비 (리터당 주행 거리(km))
    protected int fuelTank; // 연료 탱크 크기
    protected int seatCnt;  // 좌석수
    protected String name;  // 자동차 이름;


    abstract void setMode(boolean isMode); // 상속 받은 각각의 자동차의 특수 기능

    public String getName() {
        return name;
    }

    // 총 이동 횟수
    int getMovigCnt(int passCnt) {  // 입력값으로 승객수(외부값)가 필요.
        if(passCnt % seatCnt != 0) return(passCnt / seatCnt) + 1;
        return passCnt / seatCnt;
    }
    // 총 주유 횟수
    int getRefuelCnt(int dist, int moveCnt) { // 이동 거리와 이동 횟수를 매개 변수로 전달 받음
        if (((dist * moveCnt) / fuelEff) % fuelEff != 0) return (((dist * moveCnt) / fuelEff) / fuelTank) + 1;
        return ((dist * moveCnt) / fuelEff) / fuelTank;
    }
    // 총 이동 비용
    int getTotalCost(int dist,int moveCnt) {
        // double disCost = (double) dist / fuelEff * 2000;  > 소수점
        // return (int)(disCost * moveCnt);
        return dist / fuelEff * 2000 * moveCnt;
    }
    // 총 소요 시간
    String getMovingTime(int dist,int moveCnt) {
        double getTime = (double) dist * moveCnt / maxspeed;
        int totalMinute = (int) (getTime * 60);
        int hour = totalMinute / 60;
        int minute = totalMinute % 60;
        return String.format("%d시간 %d분", hour, minute);
    }

}
