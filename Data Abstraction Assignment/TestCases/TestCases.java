import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestCases {
    Customer TestCustomer;
    @Before
    public void setup()
    {
        Customer TestCustomer;
        Deposit TestDeposit;
    }

    @Test
    public void Test()
    {
        TestCustomer = new Customer("Paul", 0, 0, 0);
        assertTrue(TestCustomer.getCheckBalance() == 0.0);
        assertTrue(TestCustomer.getSavingBalance() == 0.0); //assertEquals wasn't working for some reason, probably has to do with it being depracated
        Date TestDate = new Date();
        assertTrue(TestCustomer.getDeposits().size() == 0);
        TestCustomer.deposit(100, TestDate, "Saving");
        assertTrue(TestCustomer.getDeposits().size() == 1);
        assertTrue(TestCustomer.getDeposits().get(0).toString().equals("Withdraw of: $100.0 Date: " + TestDate.toString() + " into account: Saving"));
        assertTrue(TestCustomer.getSavingBalance() == 100.0);

        TestCustomer.withdraw(500, new Date(), "Saving");
        assertTrue(TestCustomer.getSavingBalance() == 100.0);
        Date TestDate2 = new Date();
        TestCustomer.withdraw(50, TestDate2, "Saving");
        assertTrue(TestCustomer.getSavingBalance() == 50.0);

        assertTrue(TestCustomer.getWithdraws().get(0).toString().equals("Deposit of: $50.0 Date: " + TestDate2.toString() + " into account: Saving"));
    }



}
