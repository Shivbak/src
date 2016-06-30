package dayFour.coupon;

import java.util.Scanner;

/**
 * Created by student on 30-Jun-16.
 */
public class Files {

    private String Name;
    private int price;

    public Files()
    {

    }
    public Files(String Name,int price)
    {
        this.Name = Name;
        this.price = price;
    }

    public String toString()
    {
        return (this.Name + this .price);
    }
}
