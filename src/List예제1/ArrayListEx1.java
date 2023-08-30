package List예제1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        // List 인터페이스의 참조변수로 ArrayList 객체를 참조 함
        List<MenuInfo> menuInfoList = new ArrayList<>();
        // add는 객체를 추가, 추가 할때마다 크기가 변함
        MenuInfo menuInfo1 = new MenuInfo("Americano", 2500,"coffee",true);
        menuInfoList.add(menuInfo1);   // 참조 변수를 만들어서 넣어주나 객체를 바로 넣어주나 결과는 동일
        // 위 아래는 같은 내용을 출력 한다.
        menuInfoList.add(new MenuInfo("Americano", 2500,"coffee",true));
        menuInfoList.add(new MenuInfo("Latte", 4000,"coffee",true));
        menuInfoList.add(new MenuInfo("Blacktea", 4000,"tea",true));
        // 향상된 for문 : 배열이나 Collection 클래스 자식들
        for(MenuInfo menu : menuInfoList) {
            System.out.println(menu.getMenuInfo());
        }
        // 기본 for문 , 위 아래 같은 내용 출력
        for (int i = 0; i < menuInfoList.size(); i++) {
            System.out.println(menuInfoList.get(i).getMenuInfo());
        }

    }
}
class MenuInfo {
    String name;
    int price;
    String category;
    String description;
    boolean isTax;

    public MenuInfo(String name, int price, String category, boolean isTax) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.isTax = isTax;
    }
    public String getMenuInfo() {
        return "{"+"\"name\":"+name+","+"\"price\":"+price+","+"\"isTax\":"+isTax+"}";
    }
}