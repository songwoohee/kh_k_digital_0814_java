package List예제1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        List<MenuInfo> menuInfo = new ArrayList<>();
        menuInfo.add(new MenuInfo("Americano", 2500,"coffee",true));
        menuInfo.add(new MenuInfo("Latte", 4000,"coffee",true));
        menuInfo.add(new MenuInfo("Blacktea", 4000,"tea",true));
        for(MenuInfo menu : menuInfo) {
            System.out.println(menu.getMenuInfo());
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