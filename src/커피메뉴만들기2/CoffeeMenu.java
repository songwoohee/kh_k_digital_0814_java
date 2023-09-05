package 커피메뉴만들기2;

import 커피메뉴만들기2.MenuInfo;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
HashMap으로 커피 메뉴 리스트 만들기
 */
public class CoffeeMenu {
    // 문자열로 만들어진 키와 커피의 여러 가지 정보가 포함된 객체를 값으로 사용
    static Map<String, MenuInfo> map = new HashMap<>();   // 값에 MenuInfo 넣으면 MenuInfo 에 대한 정보를 모두 불러온다. 객체를 통으로 끌고 온다
    public static void main(String[] args) throws IOException {
        makeMenu();    // 같은 클래스내에 있어 이름 생략 가능 ( = CoffeeMenuList.makeMenu)
        selectMenu();

    }
    static void makeMenu () {
        map.put("Americano",new MenuInfo("Americano",2500,"Coffee","기본 커피"));
        map.put("Espresso",new MenuInfo("Espresso",3000,"Coffee","기본 커피"));
        map.put("Latte",new MenuInfo("Latte",4000,"Coffee","기본 커피"));
        map.put("Vanila Latte", new MenuInfo("Vanila Latte",4500,"Coffee","달달 커피"));
        map.put("Black Tea",new MenuInfo("Black Tea",4800,"Tea","홍차 종류"));
    }
    static void selectMenu() throws IOException {
        Scanner sc = new Scanner(System.in);
        String key = "";   // 키를 받기 위한 문자열 변수
        while(true) {
            System.out.println("=".repeat(10) + "메뉴 리스트" + "=".repeat(10));
            System.out.print("[1] 메뉴 보기 [2] 메뉴 조회 [3] 메뉴 추가 [4] 메뉴 삭제 [5] 메뉴 수정 [6] 종료 : ");
            int selMenu = sc.nextInt();
            switch (selMenu){
                case 1 :
                    System.out.println("=".repeat(10) + "메뉴 보기" + "=".repeat(10));
                    for(String e : map.keySet()) {
                        System.out.println("메뉴 : " + map.get(e).getName());
                        System.out.println("가격 : " + map.get(e).getPrice());
                        System.out.println("분류 : " + map.get(e).getCategory());
                        System.out.println("설명 : " + map.get(e).getDescription());
                        System.out.println(("-".repeat(28)));
                    }
                    break;
                case 2 :
                    System.out.print("조회할 메뉴를 입력 하세요 : ");
                    key = sc.next();
                    // 포함 여부를 확인하는 메소드 containsKey(key) : map내에 해당키가 있는지 확인하여 결과를 반환
                    if(map.containsKey(key)) {
                        System.out.println("메뉴 : " + map.get(key).getName());
                        System.out.println("가격 : " + map.get(key).getPrice());
                        System.out.println("분류 : " + map.get(key).getCategory());
                        System.out.println("설명 : " + map.get(key).getDescription());
                    }  else System.out.println("해당 메뉴가 존재하지 않습니다.");
                    break;
                case 3 :
                    System.out.print("추가할 메뉴를 입력 하세요. : ");
                    key = sc.next();
                    if(map.containsKey(key)) {
                        System.out.println("해당 메뉴가 이미 존재 합니다.");
                    } else {
                        System.out.print("가격 입력 : ");
                        int price = sc.nextInt();
                        System.out.print("분류 입력 : ");
                        String category = sc.next();
                        sc.nextLine();
                        System.out.print("설명 입력 : ");
                        String description = sc.nextLine();
                        map.put(key, new MenuInfo(key,price,category,description));
                    }
                    break;
                case 4 :
                    System.out.print("삭제할 메뉴를 입력 하세요 : ");
                    key = sc.next();
                    if(map.containsKey(key)) {
                        map.remove(key);
                        System.out.println(key + "메뉴를 삭제 하였습니다.");
                    } else {
                        System.out.println("삭제할 메뉴가 없습니다.");
                    }
                    break;
                case 5 :
                    System.out.print("수정할 메뉴를 입력 하세요: ");
                    key = sc.next();
                    if(map.containsKey(key)) {
                        System.out.print("가격 입력 : ");
                        int price = sc.nextInt();
                        System.out.print("분류 입력 : ");
                        String category = sc.next();
                        sc.nextLine();
                        System.out.print("설명 입력 : ");
                        String description = sc.nextLine();
                        // 키값은 동일하고 값이 변경되는 경우에 replace() 사용
                        map.replace(key, new MenuInfo(key, price, category,description));
                    } else {
                        System.out.println("수정할 메뉴가 없습니다.");
                    } break;
                case 6 :  // 강제 종료 삭제하고, 직렬화 시키기
                    System.out.println("메뉴를 종료 합니다.");
                    FileOutputStream fos = new FileOutputStream("src/커피메뉴만들기2/coffee.bin");
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(map);   // 객체를 넣어줘
                    oos.flush();
                    oos.close();
                    fos.close();
                    return;
                default:
                    System.out.println("선택 하신 메뉴가 없습니다.");

            }
        }
    }
}


