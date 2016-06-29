package dayThree.FactoryPattern;

import java.util.Random;

/**
 * Created by student on 29-Jun-16.
 */
public class HandleError {

    public static void main(String[] args)
    {
        int a=0, b=0, c=0;

        Random r = new Random();

        for (int i =0; i< 3200; i++)
        {
            try {
                b=r.nextInt();
                c = r.nextInt();
                a = 12345 / (b/c);

                System.out.println("a : " + a);
            }

            catch (ArithmeticException e)
            {
                a = 0 ;
                System.out.println("Exception : " + e);
            }

        }
    }
}