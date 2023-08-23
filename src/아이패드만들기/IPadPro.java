package 아이패드만들기;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.SimpleTimeZone;

import static java.lang.Thread.sleep;

public class IPadPro {
    int screen;  // 1. 11인치, 2. 12.9인치
    int color;  //  1. spacegray 2. silver
    int memory; //  1. 128GB  2. 256GB 3. 512GB 4. 1TB
    int network; // 1. wifi only 2. wifi + cellular
    String name; // 각인 서비스시 이름 저장
    String productDate; // 제품 생산 일자
    String serialNum;  // 제품의 일련 번호 :  제품의 고유값
    static int cnt = 0;  // static 변수 > 클래스 소속의 변수 , 생산대 수 확인을 위해 생성 (몇 대가 생산 되었는지 확인 하는 용도, 즉 클래스가 객체로 만들어진 횟수)

    IPadPro(String name) {   // ipad 생성자 만들기
        this.name = name;
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd"); // 패턴대로 시간정보가 출력
        productDate = sdf.format(now); // 생산한 년/월/일을 가져옴
        cnt++;  // 생산 되는 갯수
        productDate += cnt;  // 문자열에 생산대 수를 이어 붙이기
    }

    boolean continueOrder() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=".repeat(5) + "iPad Pro 구입하기" + "=".repeat(5));
        System.out.print("구입 하시려면 yes / 종료는 quit : ");
        String iscontinue = sc.next();
        if (iscontinue.equalsIgnoreCase("yes")) return true;   // 구입을 진행함
        else return false;     // 구입을 하지 않음
    }

    //화면 사이즈 정하기
    void setScreen() {// 결과값을 객체에 저장. void는 반환값이 없으므로
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("디스플레이 선택  [1] 11인치 [2] 12.9인치 ");
            screen = sc.nextInt();
            if (screen == 1 || screen == 2) return;
            System.out.println("디스플레이를 다시 선택 하세요.");
        }
    }

    // 컬러
    void setColor() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("컬러 선택  [1] space gray [2] silver ");
            color = sc.nextInt();
            if (color == 1 || color == 2) return;
            System.out.println("컬러를 다시 선택 하세요.");
        }
    }

    // 메모리
    void setMemory() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("용량 선택  [1] 128GB [2] 256GB [3] 512GB [4] 1TB : ");
            memory = sc.nextInt();
            if (memory >= 0 && memory <= 5) return;
            System.out.println("용량을 다시 선택 하세요. ");
        }

    }

    // 와이파이 셀룰러 선택
    void setNetwork() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("네트워크 선택 [1] Wi-Fi [2] Wi-Fi+Cellular ");
            network = sc.nextInt();
            if (network == 1 || network == 2) return;
            System.out.println("네트워크를 다시 선택 하세요.");
        }

    }
    // 각인
    void setName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("각인 서비스를 신청 하시겠습니까? [ yes / no] ");
        String service = sc.next();
        if(service.equalsIgnoreCase("yes")) {
            System.out.print("이름을 입력 하세요 : ");
            name = sc.next();
        }
    }
    // SerialNO 만들기
    void setSerialNum() {
        String screenStr = (screen == 1) ? "11" : "13";
        String[] memStr = {"", "128", "256", "512", "1024"};
        String netStr = (network == 1) ? "W" : "C";
        serialNum = "iPad" + screenStr + memStr[memory] + netStr + productDate;  // 일련번호 생성
    }
    void progressPad() throws InterruptedException {
        int cnt = 0;
        while (true) {
            sleep(300);
            cnt++;
            System.out.print(" << iPad pro 제작 중 : [ " + cnt + " %] >> ");
            System.out.print("\r");
            if(cnt >= 100) break;
        }
    }
    void  productPad() {
        final String[] screenType = {"","11인치","12.9인치"};
        final String[] colorType = {"","space gray","silver"};
        final String[] memType = {"","128GB","256GB","512GB","1TB"};
        final String[] netType = {"","Wi-Fi","Wi-Fi+Cellular"};
        System.out.println("=".repeat(5) + "iPad Pro 사양" + "=".repeat(5));
        System.out.println("화면 크기 : " + screenType[screen]);
        System.out.println("제품 색상  : " + colorType[color]);
        System.out.println("제품 용량 : " + memType[memory]);
        System.out.println("네트워크 : " + netType[network]);
        System.out.println("이름 : " + name);
        System.out.println("일련 번호 : " + serialNum);
        System.out.println("-".repeat(40));
    }




}

