/**
 * Created by DELL on 14/09/2022.
 */
public class countbank {
    private double value;
    private double amount;


    public countbank(){ value=0;}
    public countbank(double amount){}


    public void diposit(double amount){value=value+amount;}


    public void withdraw(double amount)
    {
        value=value-amount;
    }

    public void twowithdraw(double amount){
        value=amount;

    }
    public void remaining()
    {
        value=500-400;
    }







    public double remainingbalance (){return value;}


    public void addinsert(double rate)
    {
        value=value+rate;
    }





}
