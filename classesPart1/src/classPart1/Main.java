package classPart1;

public class Main {
    public static void main(String[] args) {
// create a new data type called 'etios'. So in other words, we've created an object called Etios based on the template,Car
        Car etios = new Car();
        Car corolla = new Car();
        etios.setModel("Hatch");
        corolla.setModel("XR");
        System.out.println("Model is " + etios.getModel());
        System.out.println("Model is " + corolla.getModel());
    }
}
