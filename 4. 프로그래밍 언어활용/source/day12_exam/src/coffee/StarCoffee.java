package coffee;

import java.awt.*;

public class StarCoffee {
    int money;
    public String brewing(int money) {

        this.money += money;
        if(money == Menu.StarAmericano) {
            return "별다방 아메리카노 구입";
        } else if (money == Menu.StarLatte) {
            return "별다방 라떼 구입";
        } else {
            return null;

        }

    }
}