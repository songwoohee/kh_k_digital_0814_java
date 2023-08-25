package 코코아톡;

import java.util.Scanner;

public class CocoaMain {
    public static void main(String[] args) {
        CocoaTalk cocoaTalk = new CocoaTalk("밤비");
        cocoaTalk.writeMsg("오늘 아침에 비가 많이 왔어요 ㅠ_ㅠ");
        NetAdater adater;   // 상속을 주기 위한 인터페이스
        Scanner sc = new Scanner(System.in);
        System.out.print("네트워크 [1] WiFi [2] 5G : ");
        int sel = sc.nextInt();
        if(sel == 1) adater = new WiFi(); // 상속을 준 인터페이스를 통해 자식 객체를 접근
        else adater = new FiveG();
        cocoaTalk.send(adater);
    }
}
