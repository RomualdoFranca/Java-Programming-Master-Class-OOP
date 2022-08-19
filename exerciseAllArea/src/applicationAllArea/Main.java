package applicationAllArea;

import entitiesAllArea.AllArea;

public class Main {
    public static void main(String[] args) {
        AllArea area = new AllArea(5,4);
        System.out.println("area " + area.getArea());
        area.setHeight(-1.5);
        area.setWidth(-5.2);
        System.out.println("width " + area.getWidth());
        System.out.println("height " + area.getHeight());
        System.out.println("area " + area.getArea());

    }
}