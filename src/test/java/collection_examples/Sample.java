package collection_examples;

public class Sample {
    public static void main(String[] args) {
        A obj = new A();
        B obj1 = new B();
        A obj2 = new B();
        obj2.add();
    }
}

class A
{
   void add()
   {

   }
}
class B extends A
{
  void sub()
  {

  }
  void add()
  {

  }

}