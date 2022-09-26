package comparator_examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator_Example {

    public static void main(String[] args) {

        List<Student> stobj=new ArrayList<>();
        stobj.add(new Student("AA",001,12));
        stobj.add(new Student("DD",003,12));
        stobj.add(new Student("BB",002,11));
        Comparator<Student> agecomparor =(st1,st2)->{
            return Integer.compare(st1.age,st2.age);
        };

        Comparator<Student> idcomp=(st1,st2)->
        {
            return Integer.compare(st1.id,st2.id);
        };

        Comparator<Student> name=(st1,st2)->
        {
            return st1.name.compareTo(st2.name);
        };

        stobj.forEach(st-> System.out.println("Before Comparator--->"+st.name+" "+st.id+" "+st.age));

        Collections.sort(stobj,agecomparor);

        stobj.forEach(st-> System.out.println("After age Comparator-->"+st.name+" "+st.id+" "+st.age));

        Collections.sort(stobj,idcomp);

        stobj.forEach(st-> System.out.println("After id comparator--->"+st.name+" "+st.id+" "+st.age));

        Collections.sort(stobj,name);

        stobj.forEach(st-> System.out.println("After id name--->"+st.name+" "+st.id+" "+st.age));

    }

}
class Student{

    String name;
    int id;
    int age;

    public Student(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}