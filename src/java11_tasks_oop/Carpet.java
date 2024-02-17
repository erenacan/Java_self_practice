package java11_tasks_oop;

public class Carpet {

    public double width;
    public double length;
    public double unitPrice;
    public boolean isPersian;
    public double cost;


    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost() {

        cost = (width * length) * unitPrice;

        if (isPersian) {
            cost = cost + 200;
        }

        return cost;

    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", cost=" + cost +
                '}';
    }
}
