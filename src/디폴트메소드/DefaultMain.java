package 디폴트메소드;

import java.util.Scanner;

public class DefaultMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("제품 선택 [1] Audio [2] TV : ");
        int sel = sc.nextInt();
        RemoteControl rc;
        if(sel == 1) {
            rc = new Audio();
            rc.turnON();
            rc.setVolume(20);
            rc.setMute(true);
            RemoteControl.changeBattery();
        } else {
            rc = new Television();
            rc.turnON();
            rc.setVolume(30);
        }
        RemoteControl ps4 = new RemoteControl() {
            @Override
            public void turnON() {
                System.out.println("플스5 켭니다 ");
            }

            @Override
            public void turnOFF() {
                System.out.println("플스5 끕니다 ");
            }

            @Override
            public void setVolume(int vol) {

            }
        };

        ps4.turnON();
        ps4.turnOFF();

    }
}
