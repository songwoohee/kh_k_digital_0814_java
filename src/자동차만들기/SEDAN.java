package 자동차만들기;
/*
[승용차 옵션]
- 연비 : 12km
- 속도 : 200 km
- 연료 탱크 크기 : 45 리터
- 좌석수 : 4
- 차량이름은 생성자 입력 받아서 설정
- 부가기능 : 트렁크가 좌석으로 변경 (켜면 승객 1명 추가)
 */
import java.util.Scanner;

public class SEDAN extends CarTest {
    Scanner sc = new Scanner(System.in);
    String carName = sc.next();
    double speed = 200;
    int fuelEff = 12;
    int tankSize = 45;
    int seats = 4;

    public SEDAN(String carName) {

    }

    @Override
    public void choiceOption(boolean isOption) {

    }

    @Override
    public void choiceOption() {
        if(isOption) seats += 1;
    }


}
