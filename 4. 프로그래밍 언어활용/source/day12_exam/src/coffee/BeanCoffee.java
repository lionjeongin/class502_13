package coffee;

import java.awt.*;
import java.awt.color.ICC_ColorSpace;

public class BeanCoffee {
    int money;
    public String brewing(int money) {

        this.money += money;
        if(money == Menu.BeanAmericano) {
            return "콩다방 커피 구입";
        } else if (money == Menu.BeanLatte) {
            return "콩다방 라떼 구입";
        } else {
            return null;

        }

    }
    }
