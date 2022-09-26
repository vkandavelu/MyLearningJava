package functionainterface_examples;

public class FunctionalInterface_Example implements calculator
{
    @Override
    public int add() {
        return 1;
    }

    public static void main(String[] args) {
        FunctionalInterface_Example obj = new FunctionalInterface_Example();
        System.out.println(obj.add());

        AnonymousExample customobj= new AnonymousExample();
        System.out.println(customobj.cobj.add());

        LamdaFunctionExample lamdaobj = new LamdaFunctionExample();
        lamdaobj.m1();
    }
}
class AnonymousExample
{
    calculator cobj= new calculator() {
        @Override
        public int add() {
            return 2;
        }
    };

}

class LamdaFunctionExample
{
    public void m1()
    {
        calculator c=()->
        {
            System.out.println("Hi");
            return 3;
        };
        c.add();
    }
}

@FunctionalInterface
interface calculator
{
    //contains only one abstract method
    int add();
}