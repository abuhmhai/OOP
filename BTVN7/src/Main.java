// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    Circle circle=new Circle("Red",5.0);
    circle.displayCircleInfo();

    }
}
class Shape
{
    protected String color;

    public Shape(String color)
    {
        this.color=color;
    }
    public void displayColor()
    {
        System.out.println("Color: "+color);
    }
}
class Circle extends Shape
{
    public double radius;
    public Circle(String color, double radius)
    {
        super(color);
        this.radius=radius;
    }
    public void displayCircleInfo() {
        displayColor();
        System.out.println("Radius: "+radius);
    }
}