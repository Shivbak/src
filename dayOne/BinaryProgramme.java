package dayOne;

import java.util.Scanner;

/**
 * Created by student on 27-Jun-16.
 */
public class BinaryProgramme {

   public static void main(String[] args) {


       Scanner input = new Scanner(System.in);
       String binary = input.nextLine();


       Conversion(binary);

   }
    static void Conversion(String binary)
    {
        int result = 0 , mult = 1;
       for(int i = binary.length()-1 ; i>=0; i--)
       {
           if(binary.charAt(i)== '1')
           {

               result += mult;
           }
           mult = mult * 2;

       }
        System.out.println(result);
    }
}
