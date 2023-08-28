package 자동차만들기;
/*
[버스 옵션]
- 비 : 5km
- 속도 : 150km
- 연료탱크 크기 : 100리터
- 좌석수 : 20
- 차량이름은 입력 생성자 받아서 설정
- 부가기능 : 보조연료탱크(켜면 연료탱크 크기가 30리터 늘어남)
 */

import java.util.Scanner;

public class Bus extends CarTest{
    Scanner sc = new Scanner(System.in);
    String carName = sc.next();
    double speed = 150;
    int fuelEff = 5;
    int tankSize = 100;
    int seats = 20;

    public Bus(String carName) {

    }

    @Override
    public void choiceOption(boolean isOption) {

    }

    @Override
    public void choiceOption() {
        if(isOption) tankSize += 30;
    }

}
