public class Circle {
    //public double radius;
    private double radius;//che

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public  double Perimeter(){return 2*Math.PI*radius;}
}

