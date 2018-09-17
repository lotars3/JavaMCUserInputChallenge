package OOPMasterChallenge08;

public class DeluxeHamburger extends Hamburger{
    public DeluxeHamburger(){
        super("Deluxe","Meat+ meat" , 16.7, "white");
        super.addHamburgerAddition1("Chips", 2.89);
        super.addHamburgerAddition2("Drink", 1.91);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannon add to deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannon add to deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannon add to deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannon add to deluxe burger");
    }
}
