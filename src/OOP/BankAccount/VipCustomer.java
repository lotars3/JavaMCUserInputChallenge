package OOP.BankAccount;

public class VipCustomer{

    private String name;
    private double creditlimit;
    private String email;

    public void sailing(){
        System.out.println("Ayay captain");
    }

    public VipCustomer() {
        this("name", 50000, "email@email.pl");
    }

    public VipCustomer(String name, double creditlimit) {
        this(name, creditlimit, "email@email.pl");
    }


    public VipCustomer(String name, double creditlimit, String email) {
        this.name = name;
        this.creditlimit = creditlimit;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public double getCreditlimit() {
        return creditlimit;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

}
