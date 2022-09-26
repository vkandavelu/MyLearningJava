public class Main
{
    public static void main(String[] args) {

        Animal aobj = new Dog();
        aobj.sound();
        Dog dobj= (Dog) aobj;
        dobj.walk();
        dobj.dogeat();
    }
}

class Animal
{
    void sound()
        {
        }
    void walk()
        {

        }
}
class Dog extends Animal
{

    @Override
    public void sound() {
        System.out.println("wow wow");
    }

    @Override
    public void walk() {
        System.out.println("fast");
    }

    public void dogeat()
    {
        System.out.println("Non veg");
    }
}