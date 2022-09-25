/**
 * Created by DELL on 14/09/2022.
 */
public class testbank {
    public static void main(String[] args) {
        countbank bank=new countbank();


        bank.diposit(1000);
        System.out.println("the balance after diposit   "+bank.remainingbalance());
        bank.withdraw(500);
        System.out.println("the balance after withdraw   "+bank.remainingbalance());
        bank.twowithdraw(400);
        System.out.println("the balance after twowithdraw  "+bank.remainingbalance());
     bank.remaining();
        System.out.println("the balance after remaining  "+bank.remainingbalance());
        bank.addinsert(2000);
        System.out.println(bank.remainingbalance());






    }
}
