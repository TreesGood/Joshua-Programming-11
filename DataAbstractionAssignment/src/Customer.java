import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Date;

public class Customer {
    private int accountNumber;
    private ArrayList<Deposit> deposits = new ArrayList<Deposit>();
    private ArrayList<Withdraw> withdraws = new ArrayList<Withdraw>();
    //getters for both balances

    public double getCheckBalance() {
        return checkBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    private double checkBalance;
    private double savingBalance;

    //the assignment doesn't explain what to do with this
    private double savingRate;

    private String name;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";

    //the assignment doesn't explain what to do with this but i am going to assume it is the lowest value an account can go to
    private final int OVERDRAFT = -100;

    Customer(){
        //create default constructor
        this.name = "bob";
        this.accountNumber = 1;
        this.checkBalance = 0;
        this.savingBalance = 0;

    }

    Customer(String name, int accountNumber, double checkDeposit, double savingDeposit){
        //constructor code here
        this.name = name;
        this.accountNumber = accountNumber;
        this.checkBalance = checkDeposit;
        this.savingBalance = savingDeposit;



    }
    //requires: double, date, string
    //modifies: this, deposits
    //effects: adds the amount to the account and adds the deposit info to the deposits list
    public double deposit(double amt, Date date, String account){
        //your code here
        double currentbalance = 0;
        if(account.equals("Checking")&&checkOverdraft(amt, account)){
            checkBalance += amt;
            currentbalance = checkBalance;
            deposits.add(new Deposit(amt,date,account));

        }
        if(account.equals("Saving")&&checkOverdraft(amt,account)){
            savingBalance += amt;
            currentbalance  =savingBalance;
            deposits.add(new Deposit(amt,date,account));

        }

        return currentbalance;
    }
    //requires: double, date, string
    //modifies: this, Withdraws
    //effects: removes the amount to the account and adds the withdraw info to the withdraws

    public double withdraw(double amt, Date date, String account){
    double currentbalance = 0;

        if(account.equals("Checking")  && checkOverdraft(amt,account)){

            checkBalance -= amt;

            currentbalance = checkBalance;

            withdraws.add(new Withdraw(amt,date,account));
        }
        if(account.equals("Saving")  && checkOverdraft(amt, account)){

            savingBalance -= amt;

            currentbalance = savingBalance;

            withdraws.add(new Withdraw(amt,date,account));
        }


        return currentbalance;
    }

    //requires: double, string
    //effects: returns true if amount is less than or equal to amount in the account else returns false
    private boolean checkOverdraft(double amt, String account){
        boolean isunder;
        if(account.equals("Checking")&&checkBalance-amt >= OVERDRAFT){
            isunder  = true;

        }
        else if(account.equals("Saving")&&savingBalance-amt >= OVERDRAFT){
            isunder  = true;

        }
        else{
            isunder = false;
        }

        return isunder;
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

}
