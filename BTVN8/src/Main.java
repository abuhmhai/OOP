class Vehicle
{
    protected void start()
    {
        System.out.println("The vehicle starts");
    }
}
class Car extends Vehicle
{
    @Override
    public void start()
    {
        System.out.println("The car starts with a key");
    }
}
public class Main {
    public static void main(String[] args) {
        Car car=new Car();
        car.start();

    }
}