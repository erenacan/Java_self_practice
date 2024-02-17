package java12_tasks_encapsulation;

public class Candy {

    public String brand;
    public int quantity;
    public double price;
    public boolean hasPeanuts;


    public Candy(String brand, int quantity, double price, boolean hasPeanuts) {

        if (price <0) {
            System.err.println("The price cannot be negative");
            System.exit(0);
        }

        if (quantity <0) {
            System.err.println("The quantity cannot be negative");
            System.exit(0);
        }


        this.brand = brand;
        this.quantity = quantity;
        this.price = price;
        this.hasPeanuts = hasPeanuts;
    }

    public String toString() {
        return "Candy{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", hasPeanuts=" + hasPeanuts +
                '}';
    }
}
