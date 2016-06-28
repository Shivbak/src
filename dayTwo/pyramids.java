package dayTwo;

import java.util.Scanner;

/**
 * Created by student on 28-Jun-16.
 */
public class pyramids {

    public static void main(String[] args)
    {
        System.out.println("Enter number between 1-9:");
        Scanner input = new Scanner(System.in);
        int Number = input.nextInt();

        PyramidNumber(Number);

    }

    public static void PyramidNumber(int Number){

        int blank = 0;

        for(int i =1; i<= Number; i++)
        {
            blank = Number - i;
            for (int k = 0 ; k<blank ; k++)
            {
                System.out.print(" ");

            }

                for (int j = 1; j <= i; j++)
                {

                    System.out.print( i + " ");
                }
            System.out.println();
        }
    }
}
