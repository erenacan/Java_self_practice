package java12_tasks_encapsulation;

public class Circle {

    public double radius;




    public Circle(double radius) {
        if (radius <= 0 ){
            System.err.println("The radius cannot be set to a negative or zero");
            System.exit(0);
        }

        this.radius = radius;
    }

    public double calcArea(){
         return radius * radius * 3.14;
     }

    public double calcPerimeter(){
         return 2*radius*3.14;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
