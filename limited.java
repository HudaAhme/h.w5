/**
 * Created by DELL on 14/09/2022.
 */
public class limited {
    private int limit;
    public limited()
    {

    }
    public void setLimited(int maximum)
    {
        if (maximum<=500)
        {
            System.out.println(+maximum);
        }
        else
            System.out.println("the maximum you can not enter  ");
    }

}
