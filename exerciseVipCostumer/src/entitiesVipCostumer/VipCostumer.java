package entitiesVipCostumer;

public class VipCostumer {

    private String name;
    private double creditLimit;
    private String email;

    public VipCostumer() {
        this("Default name", 5000.0, "default@email");
    }

    public VipCostumer(String name, double creditLimit) {
        this.name = name;
        this.creditLimit = creditLimit;
    }

    public VipCostumer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
