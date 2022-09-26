package PRPL;

import java.util.Arrays;
import java.util.List;

public class CollectionExample {

    public static void main(String abc[])
    {
        List<String> alist = Arrays.asList("aa","bb");
        alist.forEach(a-> System.out.println(a));
    }
}
