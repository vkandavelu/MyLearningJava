package generics_examples;

import java.util.ArrayList;
import java.util.List;

public class Generic_Method_Example {
    public static void main(String[] args) {

        add(10);
        add("Venkat");
        Integer[] iarray={1,2,3,4};
        String[] sarray={"venkat","mani"};
        printArray(iarray);
        printArray(sarray);
        ArrayList<Double> a = new ArrayList<>();

        a.add(1.1);
        lowerBoundExample(a);
    }

    static  <T> void add(T v)
    {
        System.out.println(v);
    }

    static <T> void printArray(T[] array)
    {
        for(T element:array)
            System.out.println(element);
    }

    static <T> void upperBoundMethod(List<? extends Double> list)
    {

   for(Number s :list)
   {
       System.out.println(s);
   }
    }

    static <T> void lowerBoundExample(List<? super Double> list)
    {

    }


}
