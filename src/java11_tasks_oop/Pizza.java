package java11_tasks_oop;

public class Pizza {

    public String size;
    public int numberOfCheeseTopping;

    public int numberOfPepperoniTopping;

    public int cost;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public int calcCost() {

        if (size == "Small") {
            cost = 10 + 2 * (numberOfCheeseTopping+numberOfPepperoniTopping);
        }
        else if (size == "Medium") {
            cost = 12 + 2 * (numberOfCheeseTopping+numberOfPepperoniTopping);
        }
        else if (size == "Large") {
            cost = 14 + 2 * (numberOfCheeseTopping+numberOfPepperoniTopping);
        }

        return cost;
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", cost=" + cost +
                '}';
    }
}
