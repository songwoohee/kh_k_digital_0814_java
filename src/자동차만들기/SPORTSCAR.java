package 자동차만들기;
/*
[스포츠카 옵션]
- 연비 : 8km
- 속도 : 250km
- 연료 탱크 크기 : 30 리터
- 좌석수 : 2
- 차량이름은 생성자에서 입력 받아서 설정
- 부가기능 : 터보기능 (켜면 속도 20% 향상) (boolean isPlus)
 */

import java.util.Scanner;

    public class SPORTSCAR extends CarTest{
        Scanner sc = new Scanner(System.in);
        String carName = sc.next();

        double speed = 250;
        int fuelEff = 8;
        int tankSize = 30;
        int seats = 2;
        boolean isOption;

        public SPORTSCAR(String carName) {

        }

        @Override
       public void choiceOption(boolean isOption) {
           if(isOption) speed *= 1.2;
       }

        @Override
        public void choiceOption() {

        }

    }
