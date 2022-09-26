package stream_examples;

import java.util.*;

public class StreamExample {

    public static void main(String[] args) {

        List<Integer> liobj = Arrays.asList(1,2,3,4,5);
        long s=liobj.stream().filter(a->
        {
            boolean b = a > 2;
            return b;
        }).map(a->a*2).count();
        System.out.println(s);

        String[] str  = new String[3];

        Optional op = Optional.ofNullable(str[2]);
        if(op.isPresent())
        {
            String lowercase= str[3].toLowerCase();
        }
        else
        {
            System.out.println("No Values");
        }

    }
}
