package applicationVipCostumer;

import entitiesVipCostumer.VipCostumer;

public class Main {
    public static void main(String[] args) {
        VipCostumer costumer = new VipCostumer();
        System.out.println(costumer.getName());
        System.out.println(costumer.getCreditLimit());
        System.out.println(costumer.getEmail());
        VipCostumer costumer2 = new VipCostumer("Mamão", 10000.0);
        System.out.println(costumer2.getName());
    }
}