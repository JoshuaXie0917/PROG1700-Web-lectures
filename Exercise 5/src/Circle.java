public class Circle {
    private double radius;
    private String colour;

    public Circle() {
        this.radius = 2;
        this.colour = "Green";
    }
    public Circle(double radius){
        this.radius = radius;
        this.colour = "Green";
    }
    public Circle(double radius, String colour){
        this.radius = radius;
        this.colour = colour;
    }
    public double getRadius(){
        return radius;
    }
    public String getClour() {
        return colour;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    @Override
    public String toString(){
        return "Radius = " + radius + ", Colour = " + colour;
    }
}