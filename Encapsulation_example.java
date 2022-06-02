import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Student1
{
    private String name;
    private int id;
    private String city;

   public  Student1(String name,int id , String city)
    {
        this.name=name;
        this.id=id;
        this.city=city;

    }
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

}




public class Encapsulation_example
{
    public static void main(String[] args)
    {
        ArrayList<Student1> al = new ArrayList<>();
        al.add(new Student1("Yash",15,"Akole"));
        al.add(new Student1("Tanmay",17,"Pune"));
        al.add(new Student1("Tejas",12,"Nashik"));
        al.add(new Student1("Akshay",11,"Rajur"));
        al.add(new Student1("Swami",10,"Akkalkot"));
int i;

        System.out.println("The student info is \n");
        System.out.println("Name \tID \t\tCity");
        for (i=0;i<al.size();i++)
        {
            System.out.println(al.get(i).getName()+" \t"+al.get(i).getId()+"  \t"+al.get(i).getCity());
        }
        System.out.println(" \n The student info After Sorting by name \n");
        System.out.println("Name \tID \t\tCity");
        al.sort(Comparator.comparing(Student1::getName));
        for (i=0;i<al.size();i++)
        {
            System.out.println((al.get(i).getName()+" \t"+al.get(i).getId()+"  \t"+al.get(i).getCity()));
        }
        System.out.println(" \n The student info After Sorting by id \n");
        System.out.println("Name \tID \t\tCity");
        al.sort(Comparator.comparingInt(Student1::getId));
        for (i=0;i<al.size();i++)
        {
            System.out.println((al.get(i).getName()+" \t"+al.get(i).getId()+"  \t"+al.get(i).getCity()));
        }

        System.out.println(" \n The student info After Sorting by city \n");
        System.out.println("Name \tID \t\tCity");
        al.sort(Comparator.comparing(Student1::getCity));
        for (i=0;i<al.size();i++)
        {
            System.out.println((al.get(i).getName()+" \t"+al.get(i).getId()+"  \t"+al.get(i).getCity()));
        }



    }



}
