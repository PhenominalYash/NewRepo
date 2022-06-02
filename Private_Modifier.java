class Private_Member
{
    private String password="Yash";

   public String getPassword()
   {
       return this.password;
   }
public void setPassword(String pass)
{
    this.password=pass;


}

}



public class Private_Modifier
{
    public static void main(String[] args)
    {
        Private_Member p =new Private_Member();

        p.setPassword("yash123");
        System.out.println( p.getPassword());
    }
}
