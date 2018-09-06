package OOP.BankAccount;

public class Main{
    public static void main(String[] args) {
        BankAccount mbank = new BankAccount("1",1500 , "szymon", "515077088","szymon@szymon.pl");
        System.out.println(mbank.getBalance());
        mbank.withdrawal(500);
        mbank.setBalance(500);

        mbank.deposit(500);

        VipCustomer vipCustomer = new VipCustomer();
        System.out.println(vipCustomer.getCreditlimit());

        VipCustomer customer2 = new VipCustomer("Bob",531022.67,"email");
        System.out.println(customer2.getName());

        VipCustomer customer3 = new VipCustomer("TIm", 100.00,"");

        VipVipCustomer vipVipCustomer = new VipVipCustomer("szymon", 100000000, "email@email0","Porsche","HMSSurprise");
        System.out.println(vipVipCustomer.getCar());

        vipVipCustomer.driveCar();
        vipCustomer.sailing();
        vipVipCustomer.sailing();

    }
}
