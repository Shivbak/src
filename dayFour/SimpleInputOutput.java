package dayFour;

import java.io.*;
import java.util.Scanner;

/**
 * Created by student on 30-Jun-16.
 */
public class SimpleInputOutput {

    public static void main(String[] args)
    {


/**
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        try {
            String st = br.readLine();
           writeToFile(st);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }*/

        SimpleInputOutput si = new SimpleInputOutput();
        si.readFromFile();
    }

    static void writeToFile(String st)
    {
        System.out.println(System.getProperty("user.dir"));
        try{
            FileWriter fw = new FileWriter("result.txt");

            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(st);
            bw.close();
        }
        catch (IOException e)
        {
            System.out.println("Error Writing to File : " + e);
        }
    }

     void readFromFile()
    {
        Scanner fileReader = new Scanner(getClass().getResourceAsStream("result.txt"));

        while (fileReader.hasNextLine()) {
            String st = fileReader.nextLine();

            System.out.println(st);
        }

        fileReader.close();
    }
}
