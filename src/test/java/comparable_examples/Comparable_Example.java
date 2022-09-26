package comparable_examples;

import java.util.*;

public class Comparable_Example {

    public static void main(String[] args) {

        Movie mobj = new Movie("Roja", "Aravind", 700);
        Movie mobj1 = new Movie("Chakte", "Sharuk", 300);
        Movie mobj2 = new Movie("SpiderMan", "unkonown", 500);

        List<Movie> mj = new ArrayList<>();
        mj.add(mobj);
        mj.add(mobj1);
        mj.add(mobj2);

        mj.forEach(a -> System.out.println("Before Sorting-->" + a.actor + " " + a.year + " " + a.name));

        Collections.sort(mj);

        mj.forEach(a -> System.out.println("After Sorting-->" + a.actor + " " + a.year + " " + a.name));

        //converting String to Integer
        String a = "1";
        int b = Integer.parseInt(a);
        int c = Integer.valueOf(a);
        System.out.println("a-->" + b + " b->" + c);

        //converting int to String
        int d = 1;
        String e = String.valueOf(d);
        System.out.println("e--->" + e);
        String f = Integer.toString(d);
        System.out.println("f--->" + f);

    }

}

class Movie implements Comparable<Movie> {

    String name;
    String actor;
    int year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    Movie(String name, String actor, int year) {
        this.name = name;
        this.actor = actor;
        this.year = year;
    }


    @Override
    public int compareTo(Movie o) {
        return Integer.compare(this.year, o.year);
        //  return this.year==o.year?0:this.year<o.year?-1:1;
    }
}
