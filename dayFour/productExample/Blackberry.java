package dayFour.productExample;

import java.util.Scanner;

/**
 * Created by student on 30-Jun-16.
 */
public class Blackberry {

    private String model;
    private String description;
    private double price;
    private String category;

    public Blackberry(String model , String description, double price ,String category) {
        this.category = category;
        this.description = description;
        this.model = model;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
