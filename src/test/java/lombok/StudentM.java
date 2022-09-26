package lombok;


class StudentM {
    public static void main(String[] args) {
        Student s = Student.builder().build();
    }

}
@Builder
@Getter
 class Student
{
    String  name;
    String  city;
}