
class Test
{
    static Test obj = new Test();
    private Test()
    {

    }
    public static Test getValue()
    {

        return obj;

    }
}

public class SingleTon
{
    public static void main(String[] args)
    {
        Test a1 = Test.getValue();
        Test a2 = Test.getValue();
        System.out.println("object 1= "+a1.toString());
        System.out.println("object 1= "+a2.toString());
    }
}