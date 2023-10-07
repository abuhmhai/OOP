class Circle {
    //public double radius;
    public double radius;//che


    private double calculateArea() {
        return Math.PI * radius * radius;
    }
    private double calculatePerimeter(){
        return Math.PI*2*radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle obj = new Circle();
        obj.radius=5.0;
        System.out.println("Radius: " + obj.radius);
        System.out.println("Area: " + obj.calculateArea());
        System.out.println("Perimeter: " + obj.calculatePerimeter());

    }
}
