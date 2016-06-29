package dayThree;

import java.util.Scanner;

/**
 * Created by student on 29-Jun-16.
 */
public class HandlingInteger {

    public static void main(String[] args)
    {
        System.out.println("Enter Number between 1 and 10 : ");

        while (true)
        {
            try {

                Scanner value = new Scanner(System.in);
                int yourNum = Integer.parseInt(value.nextLine());
                if (yourNum < 1 || yourNum > 10)
                {

                    throw new Exception("Enter Number between 1 and 10 : ");

                }

                System.out.println("Your number is Valid ! It is " + yourNum);
            }
            catch (NumberFormatException e)
            {
                System.out.println("Enter only Integer value.");
                System.out.println(e.getMessage());
            }
            catch (Exception ex)
            {
                System.out.println(ex.getMessage());
            }

        }
    }
}

