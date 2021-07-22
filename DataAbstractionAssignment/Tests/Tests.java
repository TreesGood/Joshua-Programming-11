import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Tests {


    @Before
    public void setup(){

    }
    @Test
    public void testDeposittoString(){
        Date testDate;
        testDate = new Date();
        Deposit testDeposit;
        testDeposit = new Deposit(100,testDate, "Saving");

        assertEquals("Deposit of: $100.0  Date: " +testDate+ "Into account: Saving", testDeposit.toString());
    }

    @Test
    public void testWithdrawtoString(){
        Date testDate;
        testDate = new Date();
        Withdraw testWithdraw;
        testWithdraw = new Withdraw(100,testDate, "Saving");
        assertEquals("Withdraw of: $100.0  Date: " +testDate+ "Into account: Saving", testWithdraw.toString());
        testWithdraw = new Withdraw(100,testDate, "Checking");
        assertEquals("Withdraw of: $100.0  Date: " +testDate+ "Into account: Checking", testWithdraw.toString());
    }
    @Test
    public void testCustomerWithdraw(){
        Date testDate;

        testDate = new Date();

        Customer testCustomer;

        testCustomer = new Customer("fred", 1, 100.0,100.0);

        testCustomer.withdraw(500,testDate,"Saving");

        assertEquals(100.0,testCustomer.getSavingBalance(),0.0000001);

        testCustomer.withdraw(500,testDate,"Checking");

        assertEquals(100.0,testCustomer.getCheckBalance(),0.000000001);




        testCustomer.withdraw(50.0,testDate,"Saving");

        assertEquals(50.0,testCustomer.getSavingBalance(),0.0000001);

        testCustomer.withdraw(50.0,testDate,"Checking");

        assertEquals(50.0,testCustomer.getCheckBalance(),0.0000001);

    }
    @Test
    public void testCustomerDeposit(){
        Date testDate;

        testDate = new Date();

        Customer testCustomer;

        testCustomer = new Customer("fred", 1, 100.0,100.0);

        testCustomer.deposit(50.0,testDate,"Saving");

        assertEquals(150.0,testCustomer.getSavingBalance(),0.0000001);

        testCustomer.deposit(50.0,testDate,"Checking");

        assertEquals(150.0,testCustomer.getCheckBalance(),0.0000001);

    }

}
