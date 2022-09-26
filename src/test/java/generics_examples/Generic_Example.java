package generics_examples;


public class Generic_Example {

    public static void main(String[] args) {
      //  Gen e = new Gen(new A());
    }
}

abstract class Gen<T extends A>
{
   private final T a;
    Gen(T a)
    {
      this.a=a;
    }
}

class A
{

}
class B extends A
{

}
class c extends A{

}