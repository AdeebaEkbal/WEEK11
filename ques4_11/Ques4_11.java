package ques4_11;
interface Printer
{
    void connect();
    default void details() 
    {
        System.out.println("Printer details...");
    }
}
interface Scanner
{
    void connect();
    default void details() 
    {
        System.out.println("Scanner details...");
    }
}
class MultiFunctionMachine implements Printer,Scanner
{
    @Override
    public void connect()
    {
        System.out.println("connecting...");
    }
    @Override
    public void details()
    {
        Printer.super.details();
        Scanner.super.details();
    }
}
public class Ques4_11 
{
   public static void main(String[] args) 
    {
        MultiFunctionMachine b1=new MultiFunctionMachine();
        b1.connect();
        b1.details();
    }
}
