package 상근날드;
// 상근날드에서 가장 잘 팔리는 메뉴는 세트 메뉴이다. 주문할 때, 자신이 원하는 햄버거와 음료를 하나씩 골라,
// 세트로 구매하면, 가격의 합계에서 50원을 뺀 가격이 세트 메뉴의 가격이 된다.
// 햄버거는 총 3종류 상덕버거, 중덕버거, 하덕버거가 있고, 음료는 콜라와 사이다 두 종류가 있다.
// 햄버거와 음료의 가격이 주어졌을 때, 가장 싼 세트 메뉴의 가격을 출력하는 프로그램을 작성하시오.

// 입력은 총 다섯 줄이다. 첫째 줄에는 상덕버거, 둘째 줄에는 중덕버거, 셋째 줄에는 하덕버거의 가격이 주어진다.
// 넷째 줄에는 콜라의 가격, 다섯째 줄에는 사이다의 가격이 주어진다. 모든 가격은 100원 이상, 2000원 이하이다.

// 첫째 줄에 가장 싼 세트 메뉴의 가격을 출력한다.

// 문제 요약 :  햄버거 3개와 음료 2개를 연속으로 입력 받고, 햄버거 중 가장 작은값, 음료 2개중 작은 값을 찾음.
// 찾은 값을 더하고 세트 메뉴이기 때문에 더한값에 50원 빼서 금액을 구함

//        800
//        700
//        900
//        198
//        330

//        848

import java.util.Scanner;
public class BurgerSet {
    public static void main(String[] args) {
        // 5개의 값을 입력 받기 위해 배열 생성
        // 키보드 입력을 받기 위해 스캐너 객체 생성

        int[] menu = new int[5]; //햄버거 3개와 음료 2개
        // 키보드 입력을 받기 위해 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);
        System.out.print("메뉴 입력 : ");
        for (int i = 0; i < menu.length; i++) menu[i] = sc.nextInt(); // 햄버거 3개, 음료 2개 금액을 입력 받음
        int minBurger = menu[0]; // 햄버거 중에 제일 싼 메뉴를 찾기 위한 시작 값
        int minDrink = menu[3];  // 음료 중에 제일 싼 메뉴를 찾기 위한 시작 값
        for (int i = 0; i < menu.length; i++) {
            if(i < 3 && minBurger > menu[i]) minBurger = menu[i];
            if(i > 2 && minDrink > menu[i]) minDrink = menu[i];
        }
        System.out.println(minBurger + minDrink - 50);

//        출력
//        메뉴 입력 : 1000 800 700 150 300
//        800

//        내가 풀다 만거..

//        int[] menu = new int[5];
//        menu[0] = 1000;
//        menu[1] = 900;
//        menu[2] = 700;
//        menu[3] = 300;
//        menu[4] = 150;
//
//        System.out.println(menu[0]);
//        System.out.println(menu[1]);
//        System.out.println(menu[2]);
//        System.out.println(menu[3]);
//        System.out.println(menu[4]);
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("메뉴를 고르세요 : ");
//        int m = sc.nextInt();
//        System.out.println(menu[3]);


    }
}
