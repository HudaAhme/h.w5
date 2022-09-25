/**
 * Created by DELL on 14/09/2022.
 */
public class SavingAccount {
    public double balance,rate;
    public SavingAccount(double balance,double rate)
    {

    }


    public void addinsert()
    {
          rate=balance* rate;

    }


    public double getRate()
    {
        return rate;
    }

    public void AddElterrest()
    {
        rate=balance+rate;
    }

}
