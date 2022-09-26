package tostring_examples;

import java.util.Objects;

public class ToString_Example {

    public static void main(String[] args) {

        Student s1 = new Student("venkat",30);
        Student s2= new Student("Deepa",30);
        int a = 10;
        System.out.println(a);
        System.out.println(s2);
    }
}

class Student
{
    String name;
    int age;
    Student(String name,int age)
    {
        this.age=age;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}