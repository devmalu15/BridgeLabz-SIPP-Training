package ClassAndObject.Class_and_Object;
public class Circle {
    double radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public double calcArea() {
        return Math.PI * radius * radius;
    }

    public double calcCircumference(){
        return 2 * Math.PI * radius;
    }

    public void DisplayDetails(){
        System.out.println("Radius:" + radius);
        System.out.println("Area"+calcArea());
        System.out.println("Circumference"+calcCircumference());
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);

        circle.DisplayDetails();
    }
}