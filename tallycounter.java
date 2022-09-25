/**
 * Created by DELL on 14/09/2022.
 */
public class tallycounter {
   private int number;


    public tallycounter()
    {
        number=0;
    }
    public void undo(int number) {
        if (number > 0) {
            System.out.println(number - 1);
        } else
            System.out.println(0);
    }

    }






