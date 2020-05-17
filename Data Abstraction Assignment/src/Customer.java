import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Date;

public class Customer {
    private int accountNumber;
    private ArrayList<Deposit> deposits;
    private ArrayList<Withdraw> withdraws;
    private double checkBalance;
    private double savingBalance;
    private double savingRate;
    private String name;


    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private final int OVERDRAFT = -100;

    Customer(){
        this.accountNumber = 0;
        this.deposits = new ArrayList<Deposit>();
        this.withdraws = new ArrayList<Withdraw>();
        this.checkBalance = 0;
        this.savingBalance = 0;
        this.savingRate = 0;
        this.name = "Default Name";

    }
    Customer(String name, int accountNumber, double checkDeposit, double savingDeposit){
        this.accountNumber = accountNumber;
        this.checkBalance = checkDeposit;
        this.savingBalance = savingDeposit;
        this.deposits = new ArrayList<Deposit>();
        this.withdraws = new ArrayList<Withdraw>();
        this.name = name;
        this.savingRate = 0;

    }

    public double deposit(double amt, Date date, String account){

        if(!account.equals(CHECKING) && !account.equals(SAVING))
        {
            System.out.println("Invalid\n");
            return 0;
        }
        deposits.add(new Deposit(amt, date, account));
        if(account.equals(CHECKING))
        {
            checkBalance+= amt;
        }
        if(account.equals(SAVING))
        {
            savingBalance+= amt;
        }


        return 0;
    }
    public double withdraw(double amt, Date date, String account){
        if(checkOverdraft(amt, account))
        {
            System.out.println("Exceeds Overdraft");
            return 0;
        }
        if(!account.equals(CHECKING) && !account.equals(SAVING))
        {
            System.out.println("Invalid\n");
        }
        withdraws.add(new Withdraw(amt, date, account));
        if(account.equals(CHECKING))
        {
            checkBalance-= amt;
        }
        if(account.equals(SAVING))
        {
            savingBalance-= amt;
        }


        return 0;
    }
    private boolean checkOverdraft(double amt, String account){
        if(account.equals(CHECKING))
        {
            return checkBalance - amt < OVERDRAFT;
        }
        if(account.equals(SAVING))
        {
            return savingBalance - amt < OVERDRAFT;
        }
        return false;

    }
    //do not modify
    public void displayDeposits(){
        for(Deposit d : deposits){
            System.out.println(d);
        }
    }
    //do not modify
    public void displayWithdraws(){
        for(Withdraw w : withdraws){
            System.out.println(w);
        }
    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public ArrayList<Deposit> getDeposits() {
        return deposits;
    }

    public void setDeposits(ArrayList<Deposit> deposits) {
        this.deposits = deposits;
    }

    public ArrayList<Withdraw> getWithdraws() {
        return withdraws;
    }

    public void setWithdraws(ArrayList<Withdraw> withdraws) {
        this.withdraws = withdraws;
    }

    public double getCheckBalance() {
        return checkBalance;
    }

    public void setCheckBalance(double checkBalance) {
        this.checkBalance = checkBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public double getSavingRate() {
        return savingRate;
    }

    public void setSavingRate(double savingRate) {
        this.savingRate = savingRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
