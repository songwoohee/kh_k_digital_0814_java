package 에어컨만들기;
/*
전원 : ON / OFF
온도 설정 기능
현재 온도 표시 기능
Cooler ON / OFF
Heater ON / OFF
바람세기 : 1단 / 2단 / 3단
 */

import java.util.Calendar;
import java.util.Scanner;

public class AirCon {
    private boolean isPower;   // ON / OFF , 선택값이 2가지만 있는 경우 boolean 쓰는게 best, 아니면 int로 써도 됨(0(f)/1(t)로 구분)
    private int setTemp;   // 온도 설정
    private int currTemp;  //  현재 온도
    private boolean isCooler; // 냉방기
    private boolean isHeater; // 난방기
    private int windStep;  // 1단, 2단, 3단
    AirCon() {   // 생성자 생성
        // 에어컨의 현재 온도를 보여주기 위한 값
        final int[] MONTHTEMP = {-5, 3, 10, 15, 22, 28, 32, 30, 24, 16, 8, 2};
        Calendar now = Calendar.getInstance();
        int month = now.get(Calendar.MONTH);  // MONTHTEMP 에 있는 배열의 인덱스와 동일
        currTemp = MONTHTEMP[month];   // 배열에 설정한 온도를 가져옴 , 달에 대한 정보를 가져와줘 ex. 7을 넣으면 32도를 출력
        isPower = false;
        setTemp = 18;
        isCooler = false;
        isHeater = false;
        windStep = 1;
    }
    void airConInfo() {
        String onOffStr = (isPower) ? "ON" : "OFF";
        String heaterStr = (isHeater) ? "ON" : "OFF";
        String coolerStr = (isCooler) ? "ON" : "OFF";
        final String[] windStr = {"", "1단계", "2단계", "3단계"};
        System.out.println("=".repeat(10) + "에어컨 정보" + "=".repeat(10));
        System.out.println("전원" + onOffStr);
        System.out.println("현재 온도 : " + currTemp);
        System.out.println("설정 온도 : " + setTemp);
        System.out.println("히터 : " + heaterStr);
        System.out.println("쿨러 : " + coolerStr);
        System.out.println("바람세기 : " + windStr[windStep]);
    }
    public void setAirconState() {
        Scanner sc = new Scanner(System.in);
        System.out.println("현재 온도는 " + currTemp + " 입니다.");
        System.out.print("온도를 설정 하세요. : ");
        setTemp = sc.nextInt();
        System.out.println("설정 온도는 " + setTemp + " 입니다.");
        System.out.print("바람 세기를 설정 하세요. (1단/2단/3단) : ");
        windStep = sc.nextInt();
        if (currTemp > setTemp) {  // 설정 온도가 현재 온도 보다 낮은 상태. 즉, 더운 상태
            System.out.println("Cooler가 동작 합니다.");
            isCooler = true;
            isHeater = false;  // 혹시 모르니 히터도 꺼주는 동작을 해줌.
        } else if (currTemp < setTemp) { // 설정 온도가 현재 온도보다 높은 상태. 즉, 추운 상태
            isCooler = false;
            isHeater = true;
        } else {
            isCooler = false;
            isHeater = false;
        }

    }
    public void setPower(boolean power) {
        isPower = power;
    }
    public int getWindStep() {
        return windStep;
    }
    public boolean isHeater() {
        return isHeater;
    }
    public boolean isCooler() {
        return isCooler;
    }
    public void setCurrTemp(int n) {  // 매개변수의 정수값을 받아 현재 온도를 변경해 줌
        currTemp += n;
    }
    public int getCurrTemp() { // 현재 온도를 읽는 메소드
        return currTemp;
    }
    public int getSetTemp() { // 설정 온도를 읽는 메소드
        return setTemp;
    }

}
