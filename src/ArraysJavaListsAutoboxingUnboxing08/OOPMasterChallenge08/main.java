package ArraysJavaListsAutoboxingUnboxing08.OOPMasterChallenge08;

public class main{

    public static void main(String[] args){
        Hamburger hamburger = new Hamburger("Basic" , "Meat", 3,"White");
        double price = hamburger.itemizeHamburger();

        hamburger.addHamburgerAddition1("Tomato", 1.2);
        hamburger.addHamburgerAddition2("Letuce", 0.2);
        hamburger.addHamburgerAddition3("Cheese", 0.8);
        System.out.println("Total burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Healthy", 4);
        healthyBurger.addHamburgerAddition1("Ananas", 3.67);
        healthyBurger.addHealthyAddition1("Popcorn" ,2.3);
        System.out.println("Total healthy burger price is "+ healthyBurger.itemizeHamburger());

        DeluxeHamburger deluxeHamburger = new DeluxeHamburger();
        deluxeHamburger.itemizeHamburger();
    }
}
