package OOP.BankAccount;

public class VipVipCustomer extends VipCustomer{

    private String car;
    private String boat;

    public VipVipCustomer(String name, double creditlimit, String email, String car, String boat) {
        super(name, creditlimit, email);
        this.car = car;
        this.boat = boat;
    }

    public void driveCar() {
        System.out.println("I love my new car");
    }

    public String getCar() {
        return car;
    }

    @Override
    public void sailing() {
        System.out.println("Sailing is the best");
        driveCar();
    }

    public void setCar(String car) {
        this.car = car;
    }
}
