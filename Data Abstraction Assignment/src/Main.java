import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Customer jacob = new Customer("Jacob", 42, 0, 0);
        jacob.deposit(100, new Date(),"Saving");
        jacob.deposit(200, new Date(), "Checking");
        jacob.withdraw(150, new Date(), "Saving");

        jacob.displayDeposits();
        jacob.displayWithdraws();

    }
}
