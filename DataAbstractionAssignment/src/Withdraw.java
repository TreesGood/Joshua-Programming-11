import java.util.Date;

public class Withdraw {
    private double amount;
    private Date date;
    private String account;

    Withdraw(double amount, Date date, String account){
        this.amount = amount;
        this.date = date;
        this.account = account;
    }
//effects: changes the display of withdraws
    public String toString(){
        //your code here
        return "Withdraw of: $"+amount+ "  Date: "+ date +"Into account: "+account;
    }
}
