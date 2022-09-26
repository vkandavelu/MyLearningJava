package collection_examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExamples {

    public static void main(String[] args) {

        List<String> st = new ArrayList<>(10);
        st.add("A");
        st.add("D");
        st.add("C");
        st.add("null");

        //To get the elements using index
        System.out.println(st.get(0));

        //itereate using enhancedforloop
        for (String s : st)
            System.out.println(s);

        //using iterator
        Iterator<String> it = st.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }

        //using for Each
        st.forEach((a) -> System.out.println(a));

        List<String> inti = new ArrayList<>(10);
        inti.add(null);
        inti.add(null);

        inti.forEach(a-> System.out.println(a));

    }
}
