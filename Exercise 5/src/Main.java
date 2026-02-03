import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(3.5, "Blue");

        System.out.println(circle1);
        System.out.println("Area: " + circle1.getArea());
        System.out.println(circle2);
        System.out.println("Area: " + circle2.getArea());
        System.out.println(circle3);
        System.out.println("Area: " + circle3.getArea());
    }
}