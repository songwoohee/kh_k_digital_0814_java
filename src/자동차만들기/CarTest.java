package 자동차만들기;
/*
[공통 필드]
- 속도 (int speed)
- 연비 (int fuel)
- 연료탱크 크기 (int tank)
- 좌석수 (int seats)
- 차량이름 (String name)
[기본 설정 ]
- 기름값은 1리터당 2000원
- 연비란? 리터당 주행거리를 의미 합니다.   1l = *km
- 부산 400km, 강릉 200km, 대전 150km, 광주 300km
- 처음 출발시 연료통에는 기름이 없는 상태 입니다.
[기능 구현]
- 이동 지역을 선택 하세요 (1. 부산, 2. 대전, 3. 강릉, 4. 광주)
- 이동할 승객 수를 입력 하세요 ( 1 ~ 100 사이)
- 이동 차량을 선택 하세요. (1. 스포츠카, 2.승용차, 3번 버스)
- 부가 기능의 ON/OFF 를 선택 하세요.
[결과 출력 예시]
이동 지역 선택 [1]부산 [2]대전 [3]강릉 [4] 광주 : 1
이동할 승객 수 입력 : 21
이동할 차량 선택 [1]스포츠카 [2]승용차 [3]버스 : 1
부가 기능 [1]ON [2]OFF : 1
====== Ferrari ======
총 비용 : 1100000원
총 주유 횟수 : 19회
총 이동 시간 : 17.53
[필요 정보]
이동 횟수 = 승객수 / 좌석 수
주유 횟수 = (거리*이동 횟수) / 연비 / 연료 탱크 크기
총 비용 = 거리 * 이동 횟수 / 연비 * 기름값(2000)
총 시간 = 거리 * 이동 횟수 / 시속
외부에서 입력 받는 정보 : 승객수, 거리, 부가 모드
 */

public abstract class CarTest {
    int speed;  // 속도
    int fuelEff; // 연비
    int tankSize;  // 탱크 사이즈
    int seats;  //좌석수
    static String carName;  // 차량 이름
    int moveNum;  // 이동 횟수 = 승객수 / 좌석수
    boolean isOption;

//    public int distance () {
//
//    }

    public static String getCarName() {
        return carName;
    }

    public int moveNum(int peopleNum) {   //이동 횟수
        if (peopleNum % seats == 0) moveNum = peopleNum / seats;
        else moveNum = (peopleNum / seats) + 1;
        return moveNum;
    }

    public int oilingNum(int distance) {  //연비
        int oilingNum;
        if ((distance / fuelEff * moveNum) % tankSize == 0) {
            oilingNum = distance / tankSize * moveNum / fuelEff;
        } else oilingNum = distance / tankSize * moveNum / fuelEff + 1;
        return oilingNum;
    }

    public int totalCost(int distance) {  // 총 비용 ok
        return moveNum * distance / fuelEff * 2000;
    }

    public int totalTime(int distance) { //총 시간
        return (distance / moveNum) * speed;
    }


    public abstract void choiceOption(boolean isOption);

    public abstract void choiceOption();
}
