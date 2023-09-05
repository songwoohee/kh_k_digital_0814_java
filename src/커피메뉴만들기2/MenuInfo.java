package 커피메뉴만들기2;

import java.awt.*;
import java.io.Serializable;

public class MenuInfo implements Serializable {
    private String name;
    private int price;
    private String category;
    private String description;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public MenuInfo(String name, int price, String category, String description) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;


    }
}
