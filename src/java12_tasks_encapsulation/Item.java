package java12_tasks_encapsulation;

public class Item {

    public String name;
    public int unitPrice;
    public int quantity;

    public Item(String name, int unitPrice, int quantity) {

        if (name.isEmpty() || name.isBlank()) {
            System.err.println("The name is cannot be empty, blank, or special characters");
            System.exit(1);
        }

        if (!name.matches("^[a - z A - Z \\ S s ] + $")) {
            System.err.println("The name is cannot be empty, blank, or special characters");
            System.exit(1);
        }

        if (unitPrice < 0) {
            System.err.println("Unit price cannot be negative.");
            System.exit(1);
        }

        if (quantity < 0) {
            System.err.println("Quantity cannot be negative.");
            System.exit(1);


            this.name = name;
            this.unitPrice = unitPrice;
            this.quantity = quantity;
        }
    }

        public int calcCost () {
            return unitPrice * quantity;
        }

        public String toString () {
            return "Item{" +
                    "name='" + name + '\'' +
                    ", unitPrice=" + unitPrice +
                    ", quantity=" + quantity +
                    '}';
        }
    }
