package functionainterface_examples;

import java.util.function.Function;

public class FunctionalInterface_Example2 {

    public static void main(String[] args) {

        Function f= (a->{
            if(a.equals("10"))
                return 20;
            else
                return 30;
        });


        passlamdaAsMethodParameter(f);

    }

   static void passlamdaAsMethodParameter(Function fun)
    {
        System.out.println( fun.apply(10));
    }
}
