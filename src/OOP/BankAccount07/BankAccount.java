package OOP.BankAccount07;

public class BankAccount{

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phonenumber;



    public BankAccount( String accountNumber, double balance, String customerName, String email, String phonenumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phonenumber = phonenumber;
    }


    public void deposit(double deposit) {
        this.balance += deposit;
        System.out.println("Deposit of " + deposit+". Balance is " + this.balance);
    }

    public void withdrawal(double withdrawal) {
        if(this.balance - withdrawal< 0){
            System.out.println("No cash in bank account");
        }else {
            this.balance -= withdrawal;
            System.out.println("Withdrawal of " + withdrawal+ ". Remaining balance =" + this.balance);
        }
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }


}
