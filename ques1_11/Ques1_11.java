package ques1_11;
interface Account
{
    void deposit();
    
    void withdraw();
    
    static void aboutBank()
    {
        System.out.println("Bank is good...");
    }
}
class Saving implements Account
{
    @Override
    public void deposit()
    {
        System.out.println("depositing in saving...");
    }
    @Override
    public void withdraw()
    {
        System.out.println("withdrawing from saving...");
    }
}
class Current implements Account
{
    @Override
    public void deposit()
    {
        System.out.println("depositing in current...");
    }
    @Override
    public void withdraw()
    {
        System.out.println("withdrawing from current...");
    }
}
public class Ques1_11 
{
    public static void main(String[] args) 
    {
        Saving s1=new Saving();
        s1.deposit();
        s1.withdraw();
        
        Current c1=new Current();
        c1.deposit();
        c1.withdraw();
    }
}
