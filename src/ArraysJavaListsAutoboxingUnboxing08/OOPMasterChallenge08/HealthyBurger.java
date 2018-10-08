package ArraysJavaListsAutoboxingUnboxing08.OOPMasterChallenge08;

public class HealthyBurger extends Hamburger{

    private String healtyExtraName;
    private double healthyExtraPrice;

    private String healtyExtraName2;
    private double healthyExtraPrice2;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthyAddition1(String name, double price){
        this.healtyExtraName = name;
        this.healthyExtraPrice = price;
    }
    public void addHealthyAddition2(String name, double price){
        this.healtyExtraName2 = name;
        this.healthyExtraPrice2 = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice =  super.itemizeHamburger();
        if(this.healtyExtraName !=null){
            hamburgerPrice += this.healthyExtraPrice;
            System.out.println("Added " + this.healtyExtraName + " for an extra " + this.healthyExtraPrice);
        }
        if(this.healtyExtraName2 !=null){
            hamburgerPrice += this.healthyExtraPrice2;
            System.out.println("Added " + this.healtyExtraName2 + " for an extra " + this.healthyExtraPrice2);
        }

        return hamburgerPrice;
    }
}
