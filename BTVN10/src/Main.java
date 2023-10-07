class Animal
{
    public void sound()
    {
        System.out.println("Animal is making a sound");
    }
}
class Dog extends Animal {
    public void sound() {
    System.out.println("Dogs is barking");
    }
    protected void run() {
    System.out.println("Dogs is running");
    }
}
public class Main {
    public static void main(String[] args) {
       Animal animal=new Dog();

       if(animal instanceof Dog)
       {
           Dog dog= (Dog) animal;
           dog.run();
       }

    }
}