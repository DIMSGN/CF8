package gr.aueb.cf.ch18.sorting;

import org.jetbrains.annotations.NotNull;

public class Product implements Comparable<Product>{
    private String description;
    private double price;
    private int quantity;

    public Product() {

    }

    public Product(String description, double price, int quantity) {
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "description='" + description + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }


//    @Override
//    public int compareTo(@NotNull Product other) {
//        return th is.description.compareTo(other.description);
//    }

    @Override
    public int compareTo(@NotNull Product other) {
        return this.quantity - other.quantity;
    }
}
