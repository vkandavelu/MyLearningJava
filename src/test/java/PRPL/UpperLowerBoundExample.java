package PRPL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpperLowerBoundExample {

    public static void main(String[] args) {

        List<Integer> al =Arrays.asList(1,2,3);
        List<Number> nl= Arrays.asList(4,5,6);
        List<Float> fl = Arrays.asList(1.2f,1.3f);
        List<Double> dl = Arrays.asList(1.2,1.2);
        upperBoundM(al);
        upperBoundM(nl);
        upperBoundM(fl);
        upperBoundM(dl);

        lowerBound(al);
        lowerBound(nl);
     //   lowerBound(fl);

    }

    public static void upperBoundM(List<? extends Number> ls)
    {
         ls.forEach(System.out::println);
    }

    public static void lowerBound(List<? super Integer> ls)
    {

    }


}

