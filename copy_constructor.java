class Student
{
    int age;
    String name;
  Student(Student s2)
  {
      this.name=s2.name;
      this.age=s2.age;

  }
    Student(String name , int age)
    {
    // this.name=name;
   //  this.age=age;

    }

}
public class copy_constructor
{
    public static void main(String[] args) {


        Student s1 = new Student("Aman", 5);
        System.out.println( s1.name = "Ysh");
        System.out.println(s1.age=15);
        Student s2 = new Student(s1);
        System.out.println( s2.name = "Ysh");
    }
}
