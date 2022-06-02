class Test1
{
static Test1 t = new Test1();
private Test1()
{

}
public static Test1 getObj()
{
    return t;
}
}

public class Diff_Reference
{
    public static void main(String[] args)
    {
        Test1 a1 = Test1.getObj();
        Test1 a2 = Test1.getObj();
        System.out.println("a1"+a1.toString());
        System.out.println("a2"+a2.toString());
    }
}
