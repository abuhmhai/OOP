import sun.lwawt.macosx.CSystemTray;

class Shape
{
    public void draw()
    {
        System.out.println("Drawing a shape");
    }
}
class Circle extends Shape
{
    @Override
    public void draw()
    {
        System.out.println("Drawing a circle");
    }

}
public class Main {
    public static void main(String[] args) {
        Shape[] shapes={new Circle(),new Shape(),new Circle()};
        for (int i=0;i<shapes.length;i++)
        {
            if( shapes[i] instanceof Circle)
            {
                System.out.println(i+":"+"this is a circle");
            }
            System.out.print(i+":");
            shapes[i].draw();
        }

    }
}