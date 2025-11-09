package ques3_11;
interface Bike
{
    void offer();
    default void details() 
    {
        System.out.println("Bike details...");
    }
}
interface Scooty
{
    void offer();
    default void details() 
    {
        System.out.println("Scooty details...");
    }
}
class BuySomething implements Bike,Scooty
{
    @Override
    public void offer()
    {
        System.out.println("Offer...");
    }
    @Override
    public void details()
    {
        Bike.super.details();
        Scooty.super.details();
    }
}
public class Ques3_11 
{
   public static void main(String[] args) 
    {
        BuySomething b1=new BuySomething();
        b1.offer();
        b1.details();
    }
}
